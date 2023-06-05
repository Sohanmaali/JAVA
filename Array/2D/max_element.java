import java.util.Scanner;
class MaxElement
{
	public static void main(String[]args)                                  
	{
		Scanner sc = new Scanner(System.in);
		int a[][]= new int[20][20];
		int max;
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
		max = a[0][0];
		for(int i=0; i<n; i++)
		{
			for(int j = 0; j<m; j++)
			{
				if(max<a[i][j])
				{
					max = a[i][j];
				}
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
		System.out.println("Max element of Metrix "+max);
	}
}