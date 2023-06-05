//Decimal To bainari
import java.util.Scanner;
class Bainari
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int n = sc.nextInt();
		int rem, bainari=0,i=1;
		do
		{
			rem=n%2;
			bainari = bainari+rem*i;
			n/=2;
			i*=10;
		}while(n>0);
			System.out.println("bainari = "+bainari);
	}
}