/*
1 1 1 1 1
  2 2 2 2
    3 3 3
	  4 4
	    5
*/

import java.util.Scanner;
class Pattern_19
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int row = sc.nextInt();
		
		for(int i=1;i<=row;i++)
		{
			
			for(int k=1;k<=row;k++)
			{
				if(k>=i&&k<=row)
				{
					System.out.print(i+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}
}