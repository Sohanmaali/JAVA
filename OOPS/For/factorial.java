import java.util.Scanner; 

class DataClass
{
	private int a;
	public void setData(int n)
	{
		this.a = n;
	}
	public int getData()
	{
		return this.a;
	}
	/* public int fatorial()
	{
		int fact = 1;
		for(int i =1;i<=this.a;fact*=i,i++);
		return fact;
	} */
	public int fatorial(int n)
	{
		if(n==1)
		{
			return 1;
		}
		else 
		return n*fatorial(n-1);
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
		System.out.println("Factorial of given num = "+ob.fatorial(ob.getData()));
	}
	public static void main(String args[])
	{
		Factorial ob1 = new Factorial();
		ob1.run();
	}
}