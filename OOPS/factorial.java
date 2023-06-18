import java.util.Scanner; 

class DataClass
{
	private int a;
	public void setData(int n)
	{
		this.a = n;
	}
	public int fatorial()
	{
		int fact = 1;
		for(int i =1;i<=this.a;i++)
		{
			fact*=i;
		}
		return fact;
	}
}

class Factorial
{
	public void run()
	{
		DataClass ob = new DataClass();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any num ");
		int a = sc.nextInt();
		ob.setData(a);
		System.out.println("Factorial of given num = "+ob.fatorial());
	}
	public static void main(String args[])
	{
		Factorial ob1 = new Factorial();
		ob1.run();
	}
}