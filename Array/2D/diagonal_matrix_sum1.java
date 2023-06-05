import java.util.Scanner;
class DiagonalMatrixSum_1
{
	public static void main(String[]args)                                  
	{
		Scanner sc = new Scanner(System.in);
		int a[][]= new int[20][20];
		int sum = 0;
		System.out.println("Enter size of First Metrix row");
		int n = sc.nextInt();
		
		System.out.println("Enter size of First Metrix Colom");
		int m = sc.nextInt();
			
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
		if(n==m)
		{
			
			System.out.println("Diagonal Metrix Elements are");
			for(int i=0; i<n; i++)
			{
				for(int j = 0; j<m; j++)
				{
					if(j==i||i+j+1==n)
					{
						System.out.print("\t"+a[i][j]);
						sum+=a[i][j];
					}
					else
					{
						System.out.print("\t");
					}
				}
				System.out.println("\n");
			}
			System.out.println("Diagonal Metrix Elements sum : "+sum);
		}
		else
		{
			System.out.println("It's can not convert to a Diagonal Metrix");
		}
		
	}
}