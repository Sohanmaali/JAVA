import java.util.Scanner;
class DataClass
{
	private int n;
	public void strong()
	{
		int temp = this.n,sum = 0;
		for(;this.n>0;this.n/=10)
		{			
			sum+=factorial(this.n%10);
		}
		if(sum==temp)
		{
			System.out.println("Enter num is strong num");
		}
		else
		{
			System.out.println("Enter num is not strong num");
		}
	}
	public int factorial(int n)			//factorial using recurtion
	{
		if(n==1)
		{
			return 1;
		}
		else
		{
			return n * factorial(n-1);
		}
	}
	public void setData(int n)
	{
		this.n = n;
	}	
}
class StrongNum
{
	public void run()
	{
		DataClass ob = new DataClass();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int num = sc.nextInt();
		
		ob.setData(num);
		ob.strong();
	}
	public static void main(String[]args)
	{
		StrongNum ob = new StrongNum();
		ob.run();
	}
}