/*
11111
22222
33333
44444
55555
*/
import java.util.Scanner;
class Pattern_9
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int row = sc.nextInt();
	
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=row;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}