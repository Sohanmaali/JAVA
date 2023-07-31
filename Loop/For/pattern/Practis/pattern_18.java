/*
1 2 3 4 5 4 3 2 1
  1 2 3 4 3 2 1
    1 2 3 2 1
      1 2 1
        1
*/
import java.util.Scanner;
class Pattern_18
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int row = sc.nextInt();

		for(int i=1 ;i<=row;i++)
		{
			int x = 0;
			for(int j=1;j<=(row<<1)-1;j++)
			{
				if(j>=i&&j<=(row<<1)-i)
				{
					x = (j<=row?++x:--x);
					System.out.print(x+" ");
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