import java.util.Scanner;
class Diagonal
{
	public static void main(String []args)
	{
		Diagonal ob = new Diagonal();
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
		if(n==m)
		{
			System.out.println("Enter element of Matrix");
			for(int i=0;i<n;i++)
			{
				for(int j = 0;j<m;j++)
				{
					a[i][j] = sc.nextInt();
				}	
			}
			System.out.println("Actual element of Matrix");
			print(a,n,m);
			choice(a,n,m);
		}
		else
		{
			System.out.println("Diagonal not possival");
		}
	}
	public void print(int a[][],int n,int m)
	{
		for(int i=0;i<n;i++)
		{
			for(int j = 0;j <m;j++)
			{
				System.out.print("\t"+a[i][j]+" ");
			}
			System.out.println("\n");
		}
	}
	public void right(int a[][],int n,int m)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(i==j)
				{
					System.out.print("\t"+a[i][j]+" ");
				}
				else
				{
					System.out.print("\t");
				}
			}
			System.out.println("\n");
		}
	}
	public void left(int a[][],int n,int m)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(i+j==n-1)
				{
					System.out.print("\t"+a[i][j]+" ");
				}
				else
				{
					System.out.print("\t");
				}
			}
			System.out.println("\n");
		}
	}
	public void leftRight(int a[][],int n,int m)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(i==j||i+j==n-1)
				{
					System.out.print("\t"+a[i][j]+" ");
				}
				else
				{
					System.out.print("\t");
				}
			}
			System.out.println("\n");
		}
	}
	public void choice(int a[][],int n,int m)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("\n\t1 For Left Diagonal\n\t2 For right Diagonal\n\t3 For Left right Diagonal ");
		int choice = sc.nextInt();
		switch (choice)
		{
			case 1:
				right(a,n,m);
				break;
			case 2:
				left(a,n,m);
				break;
			case 3:
			leftRight(a,n,m);
		}
	}
}