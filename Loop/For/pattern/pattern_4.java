
/*
		*
	  * *
    * * *
  * * * *
* * * * *
*/

import java.util.Scanner;
class Pattern_4
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int row = sc.nextInt();
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=row;j++)
			{
				if(j>=row-i+1&&j<=row)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("\n");
		}
	}
}