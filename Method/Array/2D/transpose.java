import java.util.Scanner; 

class Transpose
{
	public void transpose()
	{
		Scanner sc = new Scanner (System.in);
		int a[][] = new int [10][10];
		
		System.out.println("Enter size of row");
		int n = sc.nextInt();
		System.out.println("Enter size of comol");
		int m = sc.nextInt();
		
		System.out.println("Enter element of array");
		for(int i = 0; i<n;i++)
		{
			for(int j = 0; j<m;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Actual metrix element are ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println(" ");
		}
		int r;
		if(m>n)
		{
			r=m;
		}
		else
		{
			r=n;
		}
		for(int i=0;i<m;i++)
		{
			for(int j=i;j<r;j++)
			{
				int temp=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=temp;
			}
		}
		System.out.println("Transpose of metrix");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
	public static void main(String args[])
	{
		Transpose ob = new Transpose();
		ob.transpose();
	}
}