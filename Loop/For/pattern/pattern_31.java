/*
*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*
*/
import java.util.Scanner;
class Pattern_31
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
				System.out.print("* ");
			}
			/*if(i==row)
			{
				for(int j=1;j<=row-i;j++)
				{
				System.out.print("* ");
				}
			}*/
			System.out.println("");
		}
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=row-i;j++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}