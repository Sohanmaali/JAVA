//Palindrome

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
class Palindrome
{
	public void run()
	{
		DataClass ob = new DataClass();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int n = sc.nextInt();
		ob.setData(n);
		if(ob.reverse()==n)
		{
			System.out.println("Enter num is palindrome");
		}
		else
		{
			System.out.println("Enter num is not palindrome");
		}
	}
	public static void main(String[]args)
	{
		Palindrome ob = new Palindrome();
		ob.run();
	}
}		
