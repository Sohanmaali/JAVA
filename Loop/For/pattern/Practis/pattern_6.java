
/*
A
BB
CCC
DDDD
EEEEE
DDDD
CCC
BB
A

*/
import java.util.Scanner;

class Pattern_6 {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int row = sc.nextInt();
		
		char ch = 'A';
		int x=1;
		for(int i=1 ;i<row<<1;i++)
		{
			for(int j=1;j<=x;j++)
			{
				System.out.print(ch);
			}
			ch = (i<row?++ch:--ch);
			x = (i<row?++x:--x);
			System.out.println("");
		}
	}
}