/*
E D C B A
D C B A
C B A
B A
A


 */

import java.util.Scanner;
class Pattern_100
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int row = sc.nextInt();
		for(int i=1;i<=row;i++)
		{
			int x = 65+row-i+1;
			for(int j=1;j<=row-i+1;j++)
			{
				
				System.out.print((char)(--x)+" ");
			}
			System.out.println("");
		}
	}
}