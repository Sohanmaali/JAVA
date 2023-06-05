//Decimal to Binary converter

import java.util.Scanner;
import java.lang.System;
import java.lang.String;
class Bainari
{
	public static void main(String[]args)
	{
		int n,bai=0,rem=0,i=1;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any Num");
		n = sc.nextInt();
		while(n>0)
		{
			rem=n%2;
			bai=bai+rem*i;
			n=n/2;
			i*=10;
		}
		
		System.out.println("Bainari num = "+bai);
	}
}