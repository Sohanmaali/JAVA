
/*
1
1 2 
1 2 3
1 2 3 4
1 2 3 4 5
*/

import java.util.Scanner;
class Pattern_15
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int row = sc.nextInt();
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.print("\n");
		}
	}
}