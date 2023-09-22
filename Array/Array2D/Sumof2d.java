import java.util.Scanner;
class Array
{
  public  static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Dimension of matric");
		int n=sc.nextInt();
		int m=sc.nextInt();
		System.out.println("Enter the element");
		int a[][] = new int[3][3];
		int a1[][] = new int[3][3];
		int sum[][] = new int[3][3];
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
		       a[i][j]=sc.nextInt();		 
			}
		}
		System.out.println("actual metric");
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.print("\t"+a[i][j]); 
				a1[i][j]=a[i][j];
			}
			System.out.println();
		}
		
		System.out.println("transposs metric");
		int temp;
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<m;j++)
			{
				temp=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=temp;
			}
			System.out.println();
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.print("\t"+a[i][j]); 		 
			}
			System.out.println();
		}
		System.out.println("Sum of matric");
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				sum[i][j]=a1[i][j]+a[i][j];		 
			}
		}	
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
			 System.out.print("\ta["+i+"]["+j+"]="+sum[i][j]);		 
			}
			System.out.println();
		}
		
	}
}                                                                                                                     