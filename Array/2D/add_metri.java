import java.util.Scanner;
class AddMetrix
{
	public static void main(String[]args)                                  
	{
		Scanner sc = new Scanner(System.in);
		int a[][]= new int[20][20];
		int b[][]= new int[20][20];
		int c[][]= new int[20][20];
		
		System.out.println("Enter size of First Metrix row");
		int n = sc.nextInt();
		
		System.out.println("Enter size of First Metrix Colom");
		int m = sc.nextInt();

		System.out.println("Enter size of Second metrix row");
		int n1 = sc.nextInt();
		
		System.out.println("Enter size of Second metrix Colom");
		int m1 = sc.nextInt();
		
		if((n==n1)&&(m==m1))
		{
			System.out.println("Enter Element of First Metrix : ");
			for(int i=0; i<n; i++)
			{
				for(int j = 0; j<m; j++)
				{
					a[i][j] = sc.nextInt();
				}
			}
		
			System.out.println("Enter Element of Second metrix : ");
		
			for(int i=0; i<n1; i++)
			{
				for(int j = 0; j<m1; j++)
				{
					b[i][j] = sc.nextInt();
				}
			}
		
			for(int i=0; i<n1; i++)
			{
				for(int j = 0; j<m1; j++)
				{
					c[i][j] = a[i][j]+b[i][j];
				}
			}
			
			System.out.println("sum of two Metrix");
			
			for(int i=0; i<n1; i++)
			{
				for(int j = 0; j<m1; j++)
				{
					System.out.print(c[i][j]+" ");
				}
				System.out.println("");
			}
		}
		else
		{
			System.out.println("Addition not pocibale");
		}
	}
}