
/*
	*
	 *
	* *
	 * *
	* * *
	 * * *
	* * *
	 * *
	* *
	*

*/
import java.util.Scanner;
class Pattern_14
{
	// not complite
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int row = sc.nextInt();
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%2!=0&&j%2!=0)
				{
					System.out.print("*  ");
				}
				else if(i%2==0&&j%2==0)
				{
					System.out.print("  *");
				}
			}
			System.out.print("\n");
		}
		
		for(int i=row-1;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%2!=0&&j%2!=0)
				{
					System.out.print("*  ");
				}
				else if(i%2==0&&j%2==0)
				{
					System.out.print("  *");
				}
			}
			System.out.print("\n");
		}
		//System.out.print(.flash());
	}
}