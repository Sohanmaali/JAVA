class Outer 
{
	int a =10;
	Outer()
	{
		
		System.out.println("Outer COn");
	}
	
	void m2()
	{
		System.out.println("Outer m2 ");
	}
	public static void main(String ar[])
	{
		Outer.Inner in = new Outer().new Inner();
		in.m1();
	}
	
	class Inner
	{
		int b= 20;
		Inner()
		{
			System.out.println("Inner Con"+a);
		}
		private	void m1()
		{
			System.out.println("Inner Class");
			m2();
		}
	}
}
class Test{
	
	/* public static void main(String ar[])
	{
		Outer.Inner in = new Outer().new Inner();
		in.m1();
	} */
}