/*
*   *
 * *
  *
 * *
*   *	 
*/

import java.util.Scanner;
class Pattern_9
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number of row");
		int row = sc.nextInt();
		int i=1 ,j,k;
		for (i=1;i<=row;i++)
		{
			for(j=1;j<=row;j++)
			{
				if(j==i||i+j==row+1)
				System.out.print("*");
			
				else
				System.out.print(" ");
			}
			
			System.out.print("\n");
		}
		
	}
}