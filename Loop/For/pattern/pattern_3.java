/*
* * * * *
* * * *
* * *
* *
*
*/

import java.util.Scanner;
class Pattern_3
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int x = sc.nextInt();
		
		for(int i=1;i<=x;i++)
		{
			for(int j=x;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.print("\n");
		}
	}
}