/*
1 2 3 4 5 4 3 2 1
  1 2 3 4 3 2 1
    1 2 3 2 1
      1 2 1
        1
*/

import java.util.Scanner;
class Pattern_12
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
			for(int k=1;k<=row-i+1;k++)
			{
				System.out.print(k+" ");
			}
			for(int k=row-i;k>=1;k--)
			{
				System.out.print(k+" ");
			}
			System.out.print("\n");
		}
	}
}