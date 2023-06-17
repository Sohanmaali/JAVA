//Factorial

import java.util.Scanner;
class DataClass
{
	private int x,y ;
	public void setData(int a,int b)
	{
		this.x = a;
		this.y = b;
	}
	public int getData()
	{
		return this.x;
	}
	public int add()
	{
		return this.x+this.y;
	}
	public int fatorial()
	{
		int fact = 1;
		for(int i = 1;i<=this.x;i++)
		{
			fact*=i;
		}
		return fact;
	}
}

class Factorial
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int x = sc.nextInt();
		int y = sc.nextInt();
		DataClass ob = new DataClass();
		ob.setData(x,y);
		System.out.println(ob.getData());
		System.out.println(ob.fatorial());
		System.out.println(ob.add());
	}
}