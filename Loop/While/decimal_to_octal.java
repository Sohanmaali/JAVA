//Decimal to Octl converter

import java.util.Scanner;
class Octal
{
	public static void main(String[]args)
	{
		int n,oct=0,rem=0,i=1;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any Num");
		n = sc.nextInt();
		while(n>0)
		{
			rem=n%8;
			oct=oct+rem*i;
			n=n/8;
			i*=10;
		}
		System.out.println("Decimal num = "+oct);
	}
}