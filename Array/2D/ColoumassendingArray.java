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
		int i,j,k;
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
		System.out.println("Asending :-");
		int temp=0;
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
            {
			    for(k=1;k<m;k++)
			    {
					if(a[k-1][i]>a[k][i])
					{
						temp = a[k][i];
						a[k][i]=a[k-1][i];
						a[k-1][i]=temp;
					}
					
				}
				System.out.println();
			}			
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
		      System.out.print(a[i][j]+"\t");		 
			}
			System.out.println();
		}
	}
}