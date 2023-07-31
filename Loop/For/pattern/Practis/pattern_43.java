
/*
9
0 1
2 3 4
5 6 7 8
9 0 1 2 3 
*/
import java.util.Scanner;

class Pattern_43
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int row = sc.nextInt();
		int x = row*2-1;
		for(int i=1 ;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(x+" ");
				x++;
				x = (x==10?x=0:x);
			}
			System.out.println("");
		}
	}
}