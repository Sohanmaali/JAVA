import java.util.Scanner;
class DataClass
{
	private int n ;
	public void setData(int n)
	{
		this.n = n;
	}
	public void perfect()
	{
		int sum=0;
		for(int i = 1; i<this.n; i++)
		{
			if(this.n%i==0)
			{
				sum+=i;
			}
		}
		if(this.n==sum)
		{
			System.out.print("Enter num is perfect");
		}
		else
		{
			System.out.print("Enter num is not perfect");
		}
	}
}
class Perfect
{
	public void run()
	{
		Scanner sc = new Scanner(System.in);
		DataClass ob = new DataClass();
		System.out.println("Enter any num");
		int num = sc.nextInt();
		ob.setData(num);
		ob.perfect();
		
	}
	public static void main(String[]args)
	{
		Perfect ob = new Perfect();
		ob.run();
	}
}