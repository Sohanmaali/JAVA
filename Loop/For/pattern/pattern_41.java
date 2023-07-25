/*
	    1
      1 2 1
    1 2 3 2 1
  1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1

*/
import java.util.Scanner;
class Pattern_41
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int row = sc.nextInt();

		for(int i=1 ;i<=row;i++)
		{
			int x=1;
			for(int j= 1;j<=(row<<1)-1;j++)
			{
				if(j>row-i&&j<=row-1+i)
				{
					System.out.print(x+" ");
					x =(j<row?++x:--x);
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}
}