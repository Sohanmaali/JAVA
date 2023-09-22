 import java.util.Scanner;
class Array
{
  public  static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Dimension of 1 matric");
		int m=sc.nextInt();
		int n=sc.nextInt();
		System.out.println("Enter the Dimension of 2 matric");
		int p=sc.nextInt();
		int q=sc.nextInt();
		System.out.println("Enter the element");
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		int c[][] = new int[3][3];
		int i,j,k;
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
		       a[i][j]=sc.nextInt();		 
			}
		}
		System.out.println("First Array");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print("\t"+a[i][j]); 
			}
			System.out.println();
		}
		for(i=0;i<p;i++)
		{
			for(j=0;j<q;j++)
			{
		       b[i][j]=sc.nextInt();		 
			}
		}
		System.out.println("Second Array");
		for(i=0;i<p;i++)
		{
			for(j=0;j<q;j++)
			{
				System.out.print("\t"+b[i][j]); 
			}
			System.out.println();
		}
		for(i=0;i<m;i++)
		{
				for(j=0;j<q;j++)
				{
					for(k=0,c[i][j]=0;k<n;k++)
					c[i][j]+=b[i][k]*a[k][j];		 
				}
			}	
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.print("\ta["+i+"]["+j+"]="+c[i][j]);		 
			}
				System.out.println();
		}
	}
}