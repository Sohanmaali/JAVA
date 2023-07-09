/*
	A
	BB
	CCC
	DDDD
	CCC
	BB
	A
*/
import java.util.Scanner;
class Pattern_40
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int row = sc.nextInt();
		char ch = 'A';
		for(int i=1,x=row;x!=0;)
		{
			if(i<row)
			{
				for(int j = 1;j<=i;j++)
				{
					System.out.print(ch+" ");
				}
				i++;
				ch++;
			}
			else
			{
				for(int j = 1;j<=x;j++)
				{
					System.out.print(ch+" ");
				}
				x--;
				ch--;
			}
			System.out.println("");
		}
	}
}