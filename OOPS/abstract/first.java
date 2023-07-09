abstract class Test
{
	int x;
	public Test(int x)
	{
		this.x=x;
	}
	public abstract void display();
}

class Test1 extends Test
{
	int y;
	public Test1(int x,int y)
	{
		super(x);
		this.y = y;
	}
	public void display()
	{
		System.out.print("X = "+super.x);
		System.out.println(" Y = "+this.y);
	}
}

class Test2 extends Test
{
	int z;
	public Test2(int x,int z)
	{
		super(x);
		this.z = z;
	}
	public void display()
	{
		System.out.print("X = "+super.x);
		System.out.println(" Z = "+this.z);
	}
}

class Main 
{
	public static void main(String[] args) 
	{
		Test ref;
		Test1 ob = new Test1(5,3);
		Test2 ob1 = new Test2(7,9);
		
		ref =ob;
		ref.display();
		
		ref =ob1;
		ref.display();
	}
}