
/*
    1
   21
  321
 4321
54321

*/
import java.util.Scanner;

class Pattern_30 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int row = sc.nextInt();
		for(int i=1 ;i<=row;i++)
		{
			int x=i;
			for(int j=1;j<=row;j++)
			{
				if(j>row-i)
				{	
					System.out.print(x);
					x--;
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