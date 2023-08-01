/*
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
*/
import java.util.Scanner;
class Pattern_19
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int row = sc.nextInt();

		for(int i=1 ;i<=row;i++)
		{
			int x = 1;
			for(int j=1;j<=row-1+i;j++)
			{
				if(j>row-i)
				{
					System.out.print("* ");
					x = (j<row?++x:--x);
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