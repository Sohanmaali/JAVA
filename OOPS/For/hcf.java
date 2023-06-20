//HCF

import java.util.Scanner;
class DataClass
{
	private int n,m;
	public void setData(int n,int m)
	{
		this.n = n;
		this.m = m;
	}
	public int hcf()
	{
		for(;this.n!=this.m;)
		{
			if(this.n>this.m)
			{
				this.n=this.n-this.m;
			}
			else
			{
				this.m-=this.n;
			}
		}
		return this.n;
	}
}
class Hcf
{
	private void run()
	{
		Scanner sc = new Scanner(System.in);
		DataClass ob = new DataClass();
		System.out.println("Enter any two num");
		int n = sc.nextInt();
		int m = sc.nextInt();
		ob.setData(n,m);
		
		System.out.println("HCF = "+ob.hcf());
	}
	public static void main(String[]args)
	{
		Hcf ob = new Hcf();
		ob.run();
	}
}	