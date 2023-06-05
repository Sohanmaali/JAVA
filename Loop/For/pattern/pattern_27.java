/*
11 12 13 14 15
7 8 9 10
4 5 6
2 3
1
*/
// not complite
import java.util.Scanner;
class Pattern_27
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int row = sc.nextInt();
		int k=row-1;
		for(int i=row;i>=1;i--)
		{
			int	l=i+k;
			for(int j=1;j<=i;j++)
			{
				System.out.print(l+" ");
				l++;
			}
			k--;
			System.out.println("");
		}
	}
}