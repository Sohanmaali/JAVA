/*

A B C D E D C B A
  A B C D C B A
    A B C B A
      A B A
        A
 
*/

import java.util.Scanner;
class Pattern_39
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int row = sc.nextInt();
		for(int i=1;i<=row;i++)
		{
			char x = 'A';
			for(int j=1;j<=(row<<1)-i;j++)
			{
				if(j>=i)
				{
					System.out.print(x+" ");
					x = (j<row?++x:--x);
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