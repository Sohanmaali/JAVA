/*
  * * * * * * * * *
    * * * * * * *
      * * * * *
        * * *
		  *
*/
import java.util.Scanner;
class Pattern_38
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int row = sc.nextInt();
		int x=1;
	
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=(row<<1)-1;j++)
			{
				if(j>=i&&j<=(row<<1)-x)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			x++;
			System.out.println();
		}
	}
}