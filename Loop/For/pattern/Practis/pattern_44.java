
/*
9
0 1
2 3 4
5 6 7 8
9 0 1 2 3 
*/
import java.util.Scanner;

class Pattern_44
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int row = sc.nextInt();
		int x = 1;
		for(int i=1 ;i<=row;i++)
		{
			
			for(int j=1;j<=(row<<1);j++)
			{
				if(j<=row-i||j>=row+i)
				{
					System.out.print(x);
				}
				else
				{
					System.out.print("_");
				}
				x = (j<=row?++x:--x);	
			}
			System.out.println("");
		}
	}
}