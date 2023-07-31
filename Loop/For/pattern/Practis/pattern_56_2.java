/*
ABCDEDCBA
ABCD DCBA
ABC   CBA
AB     BA
A       A

 */

import java.util.Scanner;
class Pattern_56_2
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int row = sc.nextInt();
		int a=1;
		for(int i=1;i<=row;i++)
		{
			char x = 'A';
			for(int j=1;j<(row<<1);j++)
			{
				if((j<=row-i+1)||(j>=row+a-1))
				{
					System.out.print(x+" ");
				}
				else
				{
					System.out.print("  ");
				}
				x = (j<row?++x:--x);
			}
			a++;
			System.out.println("");
		}
	}
}