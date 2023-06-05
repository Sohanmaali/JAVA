import java.util.Scanner;
class Pattern_1
{
	public static void main(String[]args)                                  
	{
		Scanner sc = new Scanner(System.in);
		int a[][]= new int[20][20];
		
		System.out.println("Enter size of First Metrix row");
		int n = sc.nextInt();
		
		System.out.println("Enter size of First Metrix Colom");
		int m = sc.nextInt();
		
		if(n==m)
		{
			System.out.println("Enter Element of First Metrix : ");
		
			for(int i=0; i<n; i++)
			{
				for(int j = 0; j<m; j++)
				{
					a[i][j] = sc.nextInt();
				}
			}
			
			System.out.println("Actual Metrix Element are : ");
		
			for(int i=0; i<n; i++)
			{
				for(int j = 0; j<m; j++)
				{
					System.out.print("\t"+a[i][j]+"  ");
				}
				System.out.println("\n");
			}
				System.out.println("Diagonal Metrix Elements are");
			for(int i=1; i<n-1; i++)
			{
				for(int j = 1; j<m-1; j++)
				{
					System.out.print("\t"+a[i][j]);
				}
				System.out.println("\n");
			}
		}
		else
		{
			System.out.println("It's can not convert to a Diagonal Metrix");
		}
	}
}