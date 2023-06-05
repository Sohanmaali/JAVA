import java.util.Scanner;
class SminElement
{
	public static void main(String[]args)                                  
	{
		Scanner sc = new Scanner(System.in);
		int a[][]= new int[20][20];
		
		int min = 0,max,smin=0;
		
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
		min = a[0][0];
		max = 0;
		for(int i=0; i<n; i++)
		{
			for(int j = 0; j<m; j++)
			{
				if(min>a[i][j])
				{
					min = a[i][j];
				}
			}
		}
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
		System.out.println(min+" "+max);
		//Second Mini element
		for(int i=0; i<n; i++)
		{
			for(int j = 0; j<m; j++)
			{
				if(min<a[i][j]&&a[i][j]<max)
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
		System.out.println("min element of Metrix "+max);
		
	}
}