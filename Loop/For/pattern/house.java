import java.util.Scanner;
class House
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of row ");
		int row = sc.nextInt();		
		
		for(int i =1;i<=row;i++)
		{
			for(int j=row;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				if(k==i||k==1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("\n");
		}		
		for(int i =1;i<=row;i++)
		{
			for(int j=1;j<=row;j++)
			{
				if(j==1||j==row||i==row||i==1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("\n");
		}
	}
}