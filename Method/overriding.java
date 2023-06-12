import java.util.Scanner;

class Overrinding
{
	public int add(int a,int b)
	{
		return a+b;
	}
	public int add(int a,int b,int c)
	{
		return this.add(a,b)+c;
	}
	public int add(int a,int b,int c,int d)
	{
		return this.add(a,b,c)+d;
	}
	public int multi(int a,int b)
	{
		return a*b;
	}
	public int multi(int a,int b,int c)
	{
		return this.multi(a,b)*c;
	}
	public int multi(int a,int b,int c,int d)
	{
		return this.multi(a,b,c)*d;
	}
	public static void main(String args[])
	{
		Overrinding ob = new Overrinding();
		// System.out.println(ob.add(5,6));
		// System.out.println(ob.add(5,3,2));
		// System.out.println(ob.add(5,2,7,8));
		System.out.println(ob.multi(5,6));
		System.out.println(ob.multi(5,3,2));
		System.out.println(ob.multi(5,2,7,8));
	}
}
