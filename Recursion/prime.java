import java.util.Scanner; 

class Prime
{
	int c = 0;
	public int prime(int n,int m)
	{
		if(m>2)
		{
			if(n%m==0)
			{
				c++;
				this.prime(n,m-1);
				return c;
			}
			else
			{
				this.prime(n,m-1);
			}
		}
		return c;
	}
	public void checkprime()
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter any number ");
		int n = sc.nextInt();
		
		int x = this.prime(n,n/2);
		if(x==0)
		{
			System.out.println("Enter number is prime number"+x);
		}
		else
		{
			System.out.println("Enter number is Not prime number"+x);
		}
		
	}
	public static void main(String args[])
	{
		Prime ob = new Prime();
		ob.checkprime();
	}
}