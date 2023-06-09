import java.util.Scanner;
class AscengingOrder
{
	public static void main(String []args)
	{
		AscengingOrder ob = new AscengingOrder();
		ob.takeElement();
	}
	public void takeElement()
	{
		Scanner sc = new Scanner(System.in);
		int a[][] = new int [10][10];
		
		System.out.println("Enter size of rew");
		int n = sc.nextInt();
		
		System.out.println("Enter size of colo ");
		int m = sc.nextInt();
		
		System.out.println("Enter element of Matrix");
		for(int i=0;i<n;i++)
		{
			for(int j = 0;j<m;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Actual element of Matrix");
		for(int i=0;i<n;i++)
		{
			for(int j = 0;j<m;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println(" ");
		}
		choice(a,n,m);
	}
	public void print(int a[][],int n,int m)
	{
		for(int i=0;i<n;i++)
		{
			for(int j = 0;j <m;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
	}
	public int[][] rowAscending(int a[][],int n,int m)
	{
		for(int i=0;i<n;i++)
		{
			for(int j = 0;j < m;j++)
			{
				for(int k = 0;k<m-i-1;k++)		//bubble sort
				{
					if(a[j][k]>a[j][k+1])
					{
						int temp = a[j][k+1];
						a[j][k+1]=a[j][k];
						a[j][k] = temp;
					}
				}
			}
		}
		return a;
	}
	public int[][] colomAscending(int a[][],int n,int m)
	{
		for(int i=0;i<n;i++)
		{
			for(int j = 0;j < m;j++)
			{
				for(int k = 0;k<n-i-1;k++)		//bubble sort
				{
					if(a[k][j]>a[k+1][j])
					{
						int temp = a[k][j];
						a[k][j] = a[k+1][j];
						a[k+1][j] = temp;
					}
				}
			}
		}
		return a;
	}
	public int[][] rcAscending(int a[][],int n,int m)
	{
		rowAscending(a,n,m);
		System.out.println("Row Ascending Order");
		
		print(a,n,m);
		
		colomAscending(a,n,m);
		return a;
	}
	public int[][] rowDiscending(int a[][],int n,int m)
	{
		for(int i=0;i<n;i++)
		{
			for(int j = 0;j < m;j++)
			{
				int min = a[i][j];
				int pos = j;
				for(int k = j+1;k < m;k++)		//Selection sort
				{
					if(min < a[i][k])
					{
						min = a[i][k];
						pos = k;
					}
				}
				a[i][pos] = a[i][j];
				a[i][j] = min;
			}
		}
		return a;
	}
	public int[][] coloDiscending(int a[][],int n,int m)
	{
		for(int i=0;i<n;i++)
		{
			for(int j = 0;j < n;j++)
			{
				int min = a[j][i];
				int pos = j;
				for(int k = j+1;k<n;k++)		//Selection sort
				{
					if(min<a[k][i])
					{
						min=a[k][i];
						pos = k;
					}
				}
				a[pos][i]=a[j][i];
				a[j][i] = min;
			}
		}
		return a; 
	}
	public void choice(int a[][],int n,int m)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("\n\t1 For Row Ascending Order\n\t2 For Colom Ascending Order\n\t3 For Row  Discending\n\t4 For Colom Discendingn\n\t5 For Row Colom Asecendingn");
		int choice = sc.nextInt();
		switch (choice)
		{
			case 1:
				a = rowAscending(a,n,m);
				System.out.println("Row Ascending Order");
				print(a,n,m);
				break;
			case 2:
				a = colomAscending(a,n,m);
				System.out.println("colom Ascending Order");
				print(a,n,m);
				break;
			case 3 :
				a = rowDiscending(a,n,m);
				System.out.println("Row Discending Order");
				print(a,n,m);
				break;		
			case 4 :
				a = coloDiscending(a,n,m);
				System.out.println("colom Discending Order");
				print(a,n,m);
				break;		
			case 5 :
				a = rcAscending(a,n,m);
				System.out.println("Row colom Ascending Order");
				print(a,n,m);
				break;			
		}
	}
}