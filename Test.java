/* //Extend class
class Fruit
{
	public void taste()
	{
		System.out.println("Sweet");
	}
}
class Main
{
	public static void main(String args[])
	{
		Fruit ob = new Fruit()
		{
			public void taste()
			{
		        System.out.println("Sour");
			}
		};
		ob.taste();
	}
} */

/* final class Student {

	private final String name;
	private final int regNo;

	public Student(String name, int regNo)
	{
		this.name = name;
		this.regNo = regNo;
	}
	
	public String getName() {
		return name; 
	}

	public int getRegNo() {
		return regNo;
	}
}

class Test {

	public static void main(String[] args)
	{
		
		Student s = new Student("ABC", 101);
		Student s1 = new Student("SOHAN", 101);

		System.out.println(s.getName());
		System.out.println(s.getRegNo());
		
		System.out.println(s1.getName());
		System.out.println(s1.getRegNo());
	}
} */

interface MyinterFace
{
	int a = 10;
	a=10;
	default void myMethod()
	{
		System.out.println(a);
	}
}
class Main implements MyinterFace
{
	public static void main(String[] args)
	{
		Main obj = new Main();
		obj.myMethod();
	}
}