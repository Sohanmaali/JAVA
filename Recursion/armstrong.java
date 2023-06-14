import java.util.Scanner; 

class Armstrong
{
	int sum = 0,c = 0;
	public int power(int n,int m)
	{
		int pow;
		if(m==1)
		{
			return n;
		}
		else
		{
			pow = n*power(n,m-1);
		}
		return pow;
	}
	public  int armstrong(int n,int m)
	{
		if(n>0)
		{
			sum += power(rem(n),m);
			this.armstrong(n/10,m);
		}
		return sum;
	}
	public int rem(int n)
	{
		return n%10;
	}
	public int count(int n)
	{
		if(n>0)
		{
			c++;
			this.count(n/10);
		}
		return c;
	}
	public void checkArmstrong()
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter any number ");
		int n = sc.nextInt();
		
		int x = this.armstrong(n,this.count(n));
		if(x==n)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not Armstrong number");
		}
		
	}
	public static void main(String args[])
	{
		Armstrong ob = new Armstrong();
		ob.checkArmstrong();
	}
}