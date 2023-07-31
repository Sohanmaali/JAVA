
/*
123454321
 2345432
  34543
   454
    5

*/
import java.util.Scanner;

class Pattern_29 {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int row = sc.nextInt();
		for(int i=1 ;i<=row;i++)
		{
			int x=0;
			for(int j=1;j<=(row<<1)-i;j++)
			{
				x = (j<=row?++x:--x);
				if(j>=i)
				{
					System.out.print(x);
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