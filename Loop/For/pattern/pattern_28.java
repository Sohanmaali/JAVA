
/*
         a
       1 2 3
     b c d e f
   4 5 6 4 8 9 10
 g h i j k l m n o
*/

import java.util.Scanner;
class Pattern_28
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int row = sc.nextInt();
		int a=1;
		char b=97;
		for(int i=1;i<=row;i++)
		{
			
			for(int j=1;j<=row-i;j++)
			{
				System.out.print("  ");
			}
			
			for(int k=1;k<=i*2-1;k++)
			{
				if(i%2==0)
				{
					System.out.print(a+" ");
					a++;
				}
				else
				{
					System.out.print(b+" ");
					b++;
				}
			}
			System.out.println("");
		}
	}
}