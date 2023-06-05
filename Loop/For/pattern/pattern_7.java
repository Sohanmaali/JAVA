/*
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
*/

import java.util.Scanner;
class Pattern_7
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of row ");
		int row = sc.nextInt();		
		int k= row-1;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=(row<<1);j++)
			{
				if(j>row-i+1&&j<=(row<<1)-k)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			k--;
			System.out.print("\n");
		}
	}
}