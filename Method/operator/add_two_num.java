
import java.util.Scanner; 

// Add integer value

class AddInt
{ 
	
	public void addInt()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any two number ");
		int a = sc.nextInt();  
		int b = sc.nextInt(); 
		int c = a + b;
		System.out.println("Addition = "+c);
	}
	
	public static void main(String[]args)
	{		
		AddInt ob = new AddInt();
		
		ob.addInt();
	}
 }

// Add Float value

class AddFloat
{
 
	public void addFloat()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any two number ");
		float a = sc.nextFloat();  
		float b = sc.nextFloat(); 
		float c = a + b;
		System.out.println("Addition = "+c);
	}
	
	public static void main(String[]args)
	{		
		AddFloat ob = new AddFloat();
		
		ob.addFloat();
	}
}
	
// Add Double value
	
class AddDouble
{

	public void addDouble()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any two number ");
		double a = sc.nextDouble();  
		double b = sc.nextDouble(); 
		double c = a + b;
		System.out.println("Addition = "+c);
	}
	public static void main(String[]args)
	{		
		AddDouble ob = new AddDouble();
		
		ob.addDouble();
	}
}
	
// Add Long value
	
class AddLong
{

	public void addLong()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any two number ");
		long a = sc.nextLong();  
		long b = sc.nextLong(); 
		long c = a + b;
		System.out.println("Addition = "+c);
	}
	public static void main(String[]args)
	{		
		AddLong ob = new AddLong();
		
		ob.addLong();
	}
}

// Add Short value

class AddShort
{
	public void addShort()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any two number ");
		short a = sc.nextShort();  
		short b = sc.nextShort(); 
		short c = a + b;  //error: incompatible types: possible lossy conversion from int to short
		System.out.println("Addition = "+c);
	}
	public static void main(String[]args)
	{		
		AddShort ob = new AddShort();
		
		ob.addShort();
	}
}

// Add Byte value

class AddByte
{
	public void addByte()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any two number ");
		byte a = sc.nextByte();  
		byte b = sc.nextByte(); 
		byte c = a + b; //error: incompatible types: possible lossy conversion from int to short
		System.out.println("Addition = "+c);
	}
	public static void main(String[]args)
	{		
		AddByte ob = new AddByte();
		
		ob.addByte();
	}
}