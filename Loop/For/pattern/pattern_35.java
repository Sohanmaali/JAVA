/*
    1
    1
  3 3 3
  3 3 3
5 5 5 5 5
5 5 5 5 5
*/
import java.util.Scanner;
class Pattern_35
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int row = sc.nextInt();
		int k=1,l=row-1;
		for(int i=1;i<=row;i++)
		{
			if(i>1&&i%2!=0)
			{
				l-=2;
			}
			for(int j=1;j<l;j++)
			{
				System.out.print(" ");
			}
			if(i>1&&i%2!=0)
			{
				k+=2;
			}
			for(int j=1;j<=k;j++)
			{
				System.out.print(k+" ");
			}
			System.out.println("");
		}
	}
}
