/*
         1
	   1 2 1
	 1 2 3 2 1
   1 2 3 4 3 2 1
 1 2 3 4 5 4 3 2 1
*/
import java.util.Scanner;
class Pattern_37
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int row = 5;
		for(int i =1 ;i<=5;i++)
		{
			for(int j=5,x=1;j>=1;j--)
			{
				if(i+j == row+1 )
				{
					System.out.print(x+" ");
					x++;
				}
				else
				{
					System.out.print("  ");
				}
			}
			//row--;
			System.out.println("");
		}
	}
}