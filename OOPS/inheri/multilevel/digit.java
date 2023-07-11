class A
{
	int i=2,j=4;
	public A(int i,int j)
	{
		this.i = 0;
		this.j = 0;
	}
	public A(int i,int j)
	{
		this.i = i;
		this.j = j;
	}
	public void show()
	{
		System.out.println("A = "+this.i);
		System.out.println("B = "+this.j);
	}
}
class B extends A
{
	int sum;

	public void sum()
	{
		sum = super.i+super.j;
		System.out.println("sum = "+sum);
	}
}
class C extends B
{

	public void display()
	{
		System.out.println("this is a Multilavel inheritance");
	}
}
class Main
{
	public static void main(String args[])
	{
		C obj = new C(10,25);
		obj.show();
		obj.sum();
		obj.display();
	}
}