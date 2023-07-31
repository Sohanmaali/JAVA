/*
1 2 3 4 5
  1 2 3 4
    1 2 3
      1 2
        1
*/
import java.util.Scanner;
class Pattern_16
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int row = sc.nextInt();
		
		for(int i=1;i<=row;i++)
		{
			int a=1;
			for(int j=1;j<=row;j++)
			{
				if(j>=i)
				{
					System.out.print(a+" ");
					a++;
				}
				else
					System.out.print("  ");
				
			}
			System.out.println();
		}
	}
}