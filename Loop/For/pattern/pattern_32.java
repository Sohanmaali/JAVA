/*
* *
* * * *
* * * * * *
* * * * * * * *
* * * * * * * * * *
* * * * * * * *
* * * * * *
* * * *
* *
*/
import java.util.Scanner;
class Pattern_32
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int row = sc.nextInt();
		int k=row*2;
		/*for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i*2;j++)
			{
				System.out.print("* ");
			}

			System.out.println("");
		}
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=(row*2)-(i*2);j++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}*/
		for(int i=1;i<=row*2;i++)
		{
			if(i<=row)
			{
				for(int j=1;j<=(i<<1);j++)
				{
					System.out.print("* ");
				}
			}
			else 
			{
				for(int j=k;j>(i<<1)-k;j--)
				{
					System.out.print("* ");
				}
			}
			System.out.println("");
		}
		
	}
}
