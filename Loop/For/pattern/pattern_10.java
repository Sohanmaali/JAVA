/*
1 
2 3
4 5 6
7 8 9 10
*/



import java.util.Scanner;
class Pattern_10
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number of row");
		int row = sc.nextInt();
		int i,k=1;
		
		for (i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.print("\n");
		}
		
	}
}