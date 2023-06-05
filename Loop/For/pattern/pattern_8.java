/*
        *
      * *
    * * *
  * * * *
* * * * *
*/
//not  complide
import java.util.Scanner;
class Pattern_8
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number of row");
		int row = sc.nextInt();
		int i=1,j;
		for (i=1;i<=row;i++)
		{
			for(j=1;j<=row;j++)
			{
				if(j>=row-i+1&&j<=row)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("\n");
		}
	}
}