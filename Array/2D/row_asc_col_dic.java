
// row ascending order colomc  dicending

import java.util.Scanner;
class RasceColDis
{
	public static void main(String[]args)                                  
	{
		Scanner sc = new Scanner(System.in);
		int a[][]= new int[20][20];
		
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
		
		//Bubble sort start row ascending order
		for(int i=0; i<n; i++) //right
		{
			for(int j = 0; j<n; j++)
			{
				for(int k=1; k<m;k++)
				{
					if(a[j][k-1]>a[j][k])
					{
						int temp = a[j][k-1];
						a[j][k-1] = a[j][k];
						a[j][k] = temp;
					}
				}
			}
		}
		
		System.out.println("Asending Order of Metrix row element are : ");
		
		for(int i=0; i<n; i++)
		{
			for(int j = 0; j<m; j++)
			{
				System.out.print("\t"+a[i][j]+"  ");
			}
			System.out.println("\n");
		}
		
		//Bubble sort start colom asending
		for(int i=0; i<n; i++) //right
		{
			for(int j = 0; j<m; j++)
			{
				for(int k=1; k<n;k++)
				{
					if(a[k-1][j]<a[k][j])
					{
						int temp = a[k-1][j];
						a[k-1][j] = a[k][j];
						a[k][j] = temp;
					}
				}
			}
		}
		System.out.println("Discending Order of Metrix colom element are : ");
		
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