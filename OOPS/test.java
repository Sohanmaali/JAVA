import java.util.Scanner;

/* class DataClass
{
	private int feet;
	
	public void setData(int feet)
	{
		this.feet = feet++;
	}
	public int getData()
	{
		return this.feet;
	}
}

class Hight
{
	public static void main(String args[])
	{
		DataClass ob = new DataClass();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Feet And inch");
		int feet = sc.nextInt();
		ob.setData(feet);
		
		System.out.println(ob.getData());	
	}
}*/

/* class SuperClass
{
    public SuperClass()
    { 
        System.out.println("SuperClass constructor.");
    } 

    public void show()
    { 
        System.out.println("SuperClass method.");
    } 
}

class Test extends SuperClass
{
	public Test()
    {
        System.out.println("Main Class");
    }
    public static void main(String[] args)
    {
		Test object1 = new Test(); 			// allowed 
        object1.show(); 					// allowed
       object1.SuperClass(); 			// not allowed
       Test object2 = new SuperClass();  // not allowed 
	}
}
*/
/* class Javatpoint {
	private int i;

	Javatpoint() {
	}

	Javatpoint(int i) {
		this.i = i;
	}

	public int getValue() {
		return i;
	}

	public void setValue(int i) {
		this.i = i;
	}

	//@Override
	public String toString() {
		return Integer.toString(i);
	}
}

// Testing the custom wrapper class
class TestJavatpoint {
	public static void main(String[] args) {
		Javatpoint j = new Javatpoint(10);
		System.out.println(j);
	}
} */

/* class Outer 
{
	int a = 30;
	static class Inner 
	{
		static int b = 5;
		void display()
		{
			Outer ob = new Outer();
			System.out.println(a +" "+b);	
		}
	}
	public static void main(String args [])
	{
		Inner inner = new Inner();
		inner.display();
	}
}  */

class TestOuter1{  
	static int data=30;  
	static class Inner{ 
	
		void msg(){
			System.out.println("data is "+data);
		}  
	}  
	public static void main(String args[]){  
	
		Inner obj = new TestOuter1.Inner();  
		obj.msg();  
	}  
}