import java.util.Scanner; 

class DataClass
{
	int a;
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
	
	public void fatorial1()
	{
		DataClass ob = new DataClass();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any num ");
		ob.a = sc.nextInt();
		System.out.println("Factorial of given num = "+ob.fatorial());
	}
	public static void main(String args[])
	{
		Factorial ob1 = new Factorial();
		ob1.fatorial1();
	}
	/*Factorial()
	{
		System.out.println("hy");
	}
	{
		System.out.println("by");
	} */
}