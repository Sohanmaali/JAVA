// Prime

import java.util.Scanner;

class DataClass
{
	private int n,c=0;
	
	public void setData(int x)
	{
		this.n = x;
	}
	public int getData()
	{
		return this.n;
	}
	public int prime(int n)
	{
		if(n>1)
		{
			if(this.n%n==0)
			{
				c++;
				return c;
			}
			this.prime(n-1);
		}
		return c;
	}
}

class Prime
{
	public void run()
	{
		DataClass ob1 = new DataClass();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any num");
		int x = sc.nextInt();
		
		ob1.setData(x);
		
		//System.out.println(ob1.getData());
		if(ob1.prime((ob1.getData())/2) == 0)
		{
			System.out.println("Enter Number is Prime");
		}
		else
		{
			System.out.println("Enter Number is Not Prime");
		}
	}
	public static void main(String[]args)
	{
		Prime ob = new Prime();
		ob.run();
	}
}		
