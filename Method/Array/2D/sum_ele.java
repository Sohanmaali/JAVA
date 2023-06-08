import java.util.Scanner;
class SumElement
{
	public static void main(String []args)
	{
		SumElement ob = new SumElement();
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
		
		System.out.println("Enter element of array");
		for(int i = 0; i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				a[i][j]= sc.nextInt();
			}
		}
		System.out.println(sumElement(a,n,m));
	}
	public int sumElement(int a[][],int n,int m)
	{
		int sum=0;
		for(int i = 0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				sum+=a[i][j];
			}
		}
		return sum;
	}
}