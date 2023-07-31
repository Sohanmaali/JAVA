
/*
54321
 4321
  321
   21
    1

*/
import java.util.Scanner;

class Pattern_31
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int row = sc.nextInt();
		for(int i=1 ;i<=row;i++)
		{
			
			for(int j=row;j>=1;j--)
			{
				if(j<=row-i+1)
				{	
					System.out.print(j);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}