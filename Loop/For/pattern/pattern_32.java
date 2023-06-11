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
		int k=2;
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
		for(int i=1;i<=(row<<1)-1;i++)
		{
			for(int j=1 ; j<=(row<<1);j++)
			{
				if((i<=row&&j<=i*2)||(i>row&&j<=(row<<1)-k))
				{
					System.out.print("* ");
				}
			}
			if(i>row)
			{
				k+=2;
			}
			System.out.println("");
		}
	}
}
