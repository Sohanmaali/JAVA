/*
* * * * * * * * *
* * * *   * * * *
* * *       * * *
* *           * *
*               *

*/

import java.util.Scanner;
class Pattern_25
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int row = sc.nextInt();
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=row-i+1;j++)
			{
				System.out.print("* ");
			}
			for(int j=1;j<i*2-1;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=row-i+1;j++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}