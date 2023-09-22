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
		int i,j,k,sum=0;
		if(n==m)
		{
			for(i=0;i<n;i++)
			{
				for(j=0;j<m;j++)
				{
					a[i][j]=sc.nextInt();		 
				}
			}
			for(i=0;i<n;i++)
			{
				for(k=0;k<i;k++)
				System.out.print(" ");
				for(j=i;j<m;j++)
				{
					if(i==j)
					{
						sum = sum+a[i][j];
						System.out.print(a[i][j]); 	
					}
				}
				System.out.println();
			}
			System.out.println("sum of diagonal="+sum);
		}
		else 
			System.out.println("Square matric incomplete");
	}
}