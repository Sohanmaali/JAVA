/*
1 2 3 4 5 
  2 3 4 5 
    3 4 5 
	  4 5 
	    5
*/

import java.util.Scanner;
class Pattern_18
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
				if(k>=i && k<=row)
				{
					System.out.print(k+" ");
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