/*
1
21
321
4321
54321
*/
import java.util.Scanner;
class Pattern_14
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int row = sc.nextInt();
		
		for(int i=1;i<=row;i++)
		{
			int a = i;
			for(int j=1;j<=i;j++)
			{
				System.out.print(a);
				a--;
			}
			System.out.println();
		}
	}
}