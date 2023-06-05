//decimal_to_bainari
import java.util.Scanner;
class Bainari
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int n = sc.nextInt();
		int bainari=0 ;
		int i;
		for(i=1;n>0;n/=2)
		{
			int rem = n%2;
			bainari = bainari+rem*i;
			i*=10;
		}
		System.out.println("Bainari = "+bainari);
	}
}