class A
{
	int i=2,j=4;
	
	public void show()
	{
		System.out.println("this is a super class");
	}
}
class B extends A
{
	int sum;

	public void sum()
	{
		sum = this.i+this.j;
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
		C obj = new C();
		obj.show();
		obj.sum();
		obj.display();
	}
}