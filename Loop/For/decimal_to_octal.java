//decimal_to_octal
import java.util.Scanner;
class Octal
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int n = sc.nextInt();
		int octal=0 ;
		int i;
		for(i=1;n>0;n/=8)
		{
			int rem = n%8;
			octal = octal+rem*i;
			i*=10;
		}
		System.out.println("octal = "+octal);
	}
}