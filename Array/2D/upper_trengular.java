import java.util.Scanner;
class UpperTrengular
{
	public static void main(String[]args)                                  
	{
		Scanner sc = new Scanner(System.in);
		int a[][]= new int[20][20];
		
		System.out.println("Enter the dimension of ");
		int n = sc.nextInt();
		
		System.out.println("Enter size of Colom");
		int m = sc.nextInt();
			
		
		if(n==m)
		{
			System.out.println("Enter Element of row & colom : ");
		
			for(int i=0; i<n; i++)
			{
				for(int j = 0; j<m; j++)
				{
					a[i][j] = sc.nextInt();
				}
			}
			System.out.println("Upper trengular Matrix element are");
			for(int i=0;i<n;i++)
			{
				for(int j = 0; j<m; j++)
				{
					if(j>=i&&j<=m)
					{
						System.out.print(a[i][j]+" ");
					}
					else
					{
					System.out.print("  ");
					}
				}
				System.out.println();
			}
		}
		else
		{
			System.out.println("It's can not convert to a upper trengular Metrix");
		}
	}
}