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
			for(int j=1;j<i;j++)
			{
				System.out.print("  ");
			}
			
			for(int k=i;k<=row;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println("");
		}
	}
}