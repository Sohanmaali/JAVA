
/*
EDCBA
DCBA
CBA
BA
A
*/
import java.util.Scanner;

class Pattern_42
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int row = sc.nextInt();
		for(int i=1 ;i<=row;i++)
		{
			char ch = (char)(64+row-i+1);
			for(int j=1;j<=row-i+1;j++)
			{
				System.out.print(ch);
				ch--;
			}
			System.out.println("");
		}
	}
}