/*
123454321
1234 4321
123   321
12     21
1       1
 */

import java.util.Scanner;
class Pattern_14
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int row = sc.nextInt();
		int a=1;
		for(int i=1;i<=row;i++)
		{
			int x = 1;
			for(int j=1;j<(row<<1);j++)
			{
				if((j<=row-i+1)||(j>row+a-1))
				{
					System.out.print(x+" ");
				}
				else
				{
					System.out.print("--");
				}
				x = (j<row?++x:--x);
			}
			a++;
			System.out.println("");
		}
	}
}