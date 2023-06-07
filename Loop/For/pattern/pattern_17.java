/*
5 4 3 2 1
  4 3 2 1
    3 2 1
	  2 1
	    1
		

*/

import java.util.Scanner;
class Pattern_17
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int row = sc.nextInt();
		
		for(int i=1;i<=row;i++)  //right
		{
			for(int k=1,x = row;k<=row;k++)
			{
				if(k>=i && k<=row)
				{
					System.out.print(x+" ");
					x--;
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