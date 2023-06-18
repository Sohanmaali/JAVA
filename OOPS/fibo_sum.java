import java.util.Scanner;
class FiboSum
{
	private int n;
	public void setData(int n)
	{
		this.n=n;
	}
	public int getData()
	{
		return this.n;
	}
	public void fiboSum()
	{
		int fibo=0,i=1,a=0,b=1,sum=0;	
		while(i<=n)
		{	
			System.out.print(fibo+" ");
			sum=sum+fibo;
			if(i<n)
				System.out.print(" + ");
			a=b;
			b=fibo;
			fibo = a+b;
			i++;
		}
		System.out.print(" = "+sum);
	}
}
class Test
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a term: ");
		int n = sc.nextInt();
		FiboSum ob = new FiboSum();
		ob.setData(n);
		ob.fiboSum();
	}
	
}