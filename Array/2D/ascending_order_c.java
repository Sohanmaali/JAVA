
// Colom ascending order

import java.util.Scanner;
class AscendingOrderC
{
	public static void main(String[]args)                                  
	{
		Scanner sc = new Scanner(System.in);
		int a[][]= new int[20][20];
		int max = 0;
		
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
		
		//Bubble sort start
		for(int i=0; i<n; i++) //right
		{
			for(int j = 0; j<n; j++)
			{
				for(int k=1; k<m;k++)
				{
					if(a[k-1][j]>a[k][j])
					{
						int temp = a[k-1][j];
						a[k-1][j] = a[k][j];
						a[k][j] = temp;
					}
				}
			}
		}
		System.out.println("Ascending Order of Metrix Element are : ");
		
		for(int i=0; i<n; i++)
		{
			for(int j = 0; j<m; j++)
			{
				System.out.print("\t"+a[i][j]+"  ");
			}
			System.out.println("\n");
		}
		
	}
}