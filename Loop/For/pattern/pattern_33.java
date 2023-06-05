/*
*
* * *
* * * * *
* * * * * * *
* * * * * * * * *
* * * * * * *
* * * * *
* * *
*
*/
import java.util.Scanner;
class Pattern_33
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int row = sc.nextInt();
		int k=row*2-1;
	/*	for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i*2-1;j++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
		for(int i=1;i<=row;i++) // right 
		{
			for(int j=1;j<=(row*2)-(i*2)-1;j++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
		*/
		
		for(int i=1;i<=(row<<1);i++)
		{
			if(i<=row)
			{
				for(int j=1;j<=(row<<1)-1;j++)
				{
					System.out.print("* ");
			
				}
			}
			else
			{
				for(int j=k;j>(row<<1)-k-1;j--)
				{
					System.out.print("* ");
				}
			}
			System.out.println("");
		}
	}
}