import java.util.Scanner;
class LowerTrengularSum
{
	public static void main(String[]args)                                  
	{
		Scanner sc = new Scanner(System.in);
		int a[][]= new int[20][20];
		int sum=0;
		
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
			System.out.println("Lower trengular Matrix element are");
			for(int i=0;i<n;i++)
			{
				for(int j = 0; j<=i; j++)
				{
					System.out.print("\t"+a[i][j]+" ");
					sum+=a[i][j];
					
				}
				System.out.println();
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
		}
		else
		{
			System.out.println("It's can not convert to a lower trengular Metrix");
		}
	}
}