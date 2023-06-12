import java.util.Scanner; 

class Operation
{
	public void takeElement()
	{
		
		Scanner sc = new Scanner(System.in);
		int a[][] = new int [20][20];
		int b[][] = new int [20][20];
		
		System.out.println("Enter size of first matrix row");
		int n = sc.nextInt();
		
		System.out.println("Enter size of first matrix colom ");
		int m = sc.nextInt();
		
		System.out.println("Enter element of Matrix");
		for(int i=0;i<n;i++)
		{
			for(int j = 0;j<m;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter size of second matrix row");
		int n1 = sc.nextInt();
		
		System.out.println("Enter size of second matrix colom ");
		int m1 = sc.nextInt();
		
		System.out.println("Enter element of Matrix");
		for(int i=0;i<n1;i++)
		{
			for(int j = 0;j<m1;j++)
			{
				b[i][j] = sc.nextInt();
			}
		}
		print(a,n,m);
		print(b,n1,m1);
		choice(a,b,n,m,n1,m1);
	}
	public void choice(int a[][],int b[][],int n, int m,int n1,int m1)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\t1 For Addition\n\t2 For Multiplaction ");
		int choice = sc.nextInt();
		int c[][] = new int [20][20];
		switch(choice)
		{
			case 1:
				if(n==m&&n1==m1)
				{
					c = addition(a,b,n,m);
					print(c,n,m1);
				}
				else
				{
					System.out.println("Addition not possibal");
				}
				
				break;
		
			case 2:
				if(n==m1)
				{
					c = multiplaction(a,b,n,m1,m);
					print(c,n,m1);
				}
				else
				{
					System.out.println("Multiplaction not possibal");
				}
				break;
		}
	}
	public int[][]multiplaction(int a[][],int b[][],int n, int m1,int m)
	{
		int c[][] = new int [20][20];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m1;j++)
			{
				for(int k = 0;k<m;k++)
				{
					c[i][j] = a[i][k]+b[k][j];
				}
			}
		}
		return c;
	}
	public int [][] addition(int a[][],int b[][],int n, int m)
	{
		int c[][] = new int [20][20];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				c[i][j] += a[i][j]*b[i][j];
			}
		}
		return c;
	}
	public void print(int a[][],int n,int m)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
	}
	
	public static void main(String args[])
	{
		Operation ob = new Operation();
		ob.takeElement();
	}
}