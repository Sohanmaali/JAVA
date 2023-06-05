//Decimal To octal
import java.util.Scanner;
class Octal
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int n = sc.nextInt();
		int rem, octal=0,i=1;
		do
		{
			rem=n%8;
			octal = octal+rem*i;
			n/=8;
			i*=10;
		}while(n>0);
			System.out.println("octal = "+octal);
	}
}