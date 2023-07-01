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

class SuperClass
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
       // object1.SuperClass(); 			// not allowed
       // Test object2 = new SuperClass();  // not allowed 
	}
}
