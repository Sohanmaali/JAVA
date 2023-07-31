/*
    A
   ABA
  ABCBA
 ABCDCBA
ABCDEDCBA

*/

import java.util.Scanner;
class Pattern_38
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int row = sc.nextInt();
		for(int i=1;i<=row;i++)
		{
			char x = 'A'-1;
			for(int j=1;j<=(row<<1);j++)
			{
				if(j>=row-i+1&&(j<row+i))
				{
					x = (j<=row?++x:--x);
					System.out.print(x);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}