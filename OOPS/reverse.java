//Reverse

import java.util.Scanner;
class DataClass
{
	private int n;
	public void setData(int n)
	{
		this.n = n;
	}
	public int reverse()
	{
		int rev=0;
		
		for(;this.n>0;this.n/=10)
		{
			rev = rev*10+n%10;
		}
		return rev;
	}
}
class Reverse
{
	public void run()
	{
		DataClass ob = new DataClass();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int n = sc.nextInt();
		ob.setData(n);
		System.out.println("reverse num = "+ob.reverse());
	}
	public static void main(String[]args)
	{
		Reverse ob = new Reverse();
		ob.run();
	}
}		
