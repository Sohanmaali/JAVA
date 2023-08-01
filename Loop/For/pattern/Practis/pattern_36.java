/*
    1
   121
  12321
 1234321
123454321
 1234321
  12321
   121
    1

 */

import java.util.Scanner;
class Pattern_36
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int row = sc.nextInt();
		int a=1;
		for(int i=1;i<(row<<1);i++)
		{
			int x = 1;
			for(int j=1;j<row+i;j++)
			{
				if((i<=row)&&(j>row-i)||((i>row)&&(j>a&&j<(row<<1)-a)))
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