
/*
A
BA
CBA
DCBA
EDCBA
DCBA
CBA
BA
A
*/
import java.util.Scanner;

class Pattern_41
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int row = sc.nextInt();
		char ch = 'A';
		int a=1;
		for(int i=1 ;i<(row<<1);i++)
		{
			char x = ch; 
			for(int j=1;j<=a;j++)
			{
				System.out.print(x);
				x--;
			}
			a = (i<row?++a:--a);
			ch = (i<row?++ch:--ch);
			
			System.out.println("");
		}
	}
}