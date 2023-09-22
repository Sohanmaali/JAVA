import java.util.Scanner;
class Matric
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. row");
		int n=sc.nextInt();
		System.out.println("Enter no. coloum");
		int m=sc.nextInt();
		int a[][]=new int[5][5];
		int i,j;
		if(n==m&&n%2!=0)
		{
			for(i=0;i<n;i++)
			{
				for(j=0;j<m;j++)
				{
					a[i][j]=sc.nextInt();		 
				}
			}
			System.out.println("Actual Array Element :-");
			for(i=0;i<n;i++)
			{
				for(j=0;j<m;j++)
				{
					System.out.print(a[i][j]+"\t");		 
				}
				System.out.println();
			}
			System.out.println("\n");
			System.out.println("square matrix:-");
			for(i=0;i<n;i++)
			{
				for(j=0;j<m;j++)
				{
					if(i==0||j==0||j==m-1||i==n-1)
					System.out.print(a[i][j]+"\t");
					else
					System.out.print("\t");
			
				}
				System.out.println("\n");
			}
			System.out.println("center square matrix:-");
			for(i=0;i<n;i++)
			{
				for(j=0;j<m;j++)
				{
					if(i==0||j==0||j==m-1||i==n-1)
					System.out.print("\n");
					else
					System.out.print(a[i][j]+"\t");
			
				}
				System.out.println();
			}
			System.out.println("mid matrix :-");
			for(i=0;i<n;i++)
			{
				for(j=0;j<m;j++)
				{
					if(j==n/2)
					System.out.print(a[i][j]);
					else
					System.out.print("\t");
			
				}
				System.out.println("\n");
			}
			System.out.println("Left matrix :-");
			for(i=0;i<n;i++)
			{
				for(j=0;j<m;j++)
				{
					if(i==j)
					System.out.print(a[i][j]+"\t");
					else
					System.out.print("\t");
			
				}
				System.out.println("\n");
			}
			System.out.println("Right matrix :-");
			for(i=0;i<n;i++)
			{
				for(j=0;j<m;j++)
				{
					if(i+j==m-1)
					System.out.println(a[i][j]+"\t");
					else
					System.out.print("\t");
				}
				System.out.println("\n");
			}
			System.out.println("Cross matrix :-");
			for(i=0;i<n;i++)
			{
				for(j=0;j<m;j++)
				{
					if((i+j==m-1)||(i==j)||(j==2))
					System.out.print(a[i][j]+"\t");
					else
					System.out.print("\t");
				}
			}
		}
		else
		System.out.println("Square matrix incomplete");
	}
}