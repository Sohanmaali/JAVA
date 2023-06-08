import java.util.Scanner;
class PassTwo
{
	public static void main(String []args)
	{
		PassTwo ob = new PassTwo();
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
		int b[][] = new int [10][10];
		
		System.out.println("Enter size of rew");
		int n1 = sc.nextInt();
		
		System.out.println("Enter size of colo ");
		int m1 = sc.nextInt();
		
		System.out.println("Enter element of Matrix");
		for(int i=0;i<n1;i++)
		{
			for(int j = 0;j<m1;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		print(a,b,n,m,n1,m1);
	}
	public void print(int a[][],int b[][],int n,int m,int n1,int m1)
	{
		for(int i=0;i<n;i++)
		{
			for(int j = 0;j <m;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
		System.out.println("Second matrix");
		for(int i=0;i<n1;i++)
		{
			for(int j = 0;j <m1;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println("");
		}
	}
}