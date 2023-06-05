//N even odd num squr

import java.util.Scanner;
class NevenOddSum
{
  public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int x = sc.nextInt();
		int esum=0,osum=0,even=0,odd=0;
		System.out.println("Even number sum : ");
		for(int i = 1;i<=x;i++)
		{
			 even = i*2;
			esum+=even;
			if(i<x)
			System.out.print(even+" + ");
		}
		System.out.print(even+" = "+esum);
		System.out.println("\nodd number sum : ");
		for(int i = 1;i<=x;i++)
		{
			 odd = i*2-1;
			osum+=odd;
			if(i<x)
			System.out.print(odd+" + ");
		}
		System.out.print(odd+" = "+osum);
	}
}		
