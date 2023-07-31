/*
    A
   ABA
  ABCBA
 ABCDCBA
ABCDEDCBA
 ABCDCBA
  ABCBA
   ABA
    A

 */

import java.util.Scanner;
class Pattern_37
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int row = sc.nextInt();
		int a=1;
		for(int i=1;i<(row<<1);i++)
		{
			char x = 'A';
			for(int j=1;j<=(row<<1);j++)
			{
				if((i<=row)&&(j>row-i&&j<row+i)||((i>row)&&(j>a&&j<(row<<1)-a)))
				{
					System.out.print(x);
					x = (j<row?++x:--x);
				}
				else
				{
					System.out.print(" ");
				}
			}
			if(i>row)
				a++;
			System.out.println("");
		}
	}
}