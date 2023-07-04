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
class Pattern_36
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int row =5;
		for(int i =1 ;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j==1||i==j||i==5)
				{
					System.out.print("* ");
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