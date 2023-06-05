
import java.util.Scanner; 

// Subtraction integer value

class SubInt
{ 
	
	public void subInt()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any two number ");
		int a = sc.nextInt();  
		int b = sc.nextInt(); 
		int c = a - b;
		System.out.println("Subtraction = "+c);
	}
	
	public static void main(String[]args)
	{		
		SubInt ob = new SubInt();
		
		ob.subInt();
	}
 }

// Subtraction Float value

class SubFloat
{
 
	public void subFloat()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any two number ");
		float a = sc.nextFloat();  
		float b = sc.nextFloat(); 
		float c = a - b;
		System.out.println("Subtraction = "+c);
	}
	
	public static void main(String[]args)
	{		
		SubFloat ob = new SubFloat();
		
		ob.subFloat();
	}
}
	
// Subtraction Double value
	
class SubDouble
{

	public void subDouble()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any two number ");
		double a = sc.nextDouble();  
		double b = sc.nextDouble(); 
		double c = a - b;
		System.out.println("Subtraction = "+c);
	}
	public static void main(String[]args)
	{		
		SubDouble ob = new SubDouble();
		
		ob.subDouble();
	}
}
	
// Subtraction Long value
	
class SubLong
{

	public void subLong()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any two number ");
		long a = sc.nextLong();  
		long b = sc.nextLong(); 
		long c = a - b;
		System.out.println("Addition = "+c);
	}
	public static void main(String[]args)
	{		
		SubLong ob = new SubLong();
		
		ob.subLong();
	}
}

// Subtraction Short value

class SubShort
{
	public void subShort()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any two number ");
		short a = sc.nextShort();  
		short b = sc.nextShort(); 
		short c = a + b;
		System.out.println("Addition = "+c);
	}
	public static void main(String[]args)
	{		
		SubShort ob = new SubShort();
		
		ob.subShort();
	}
}

// Subtraction Byte value

class SubByte
{
	public void subByte()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any two number ");
		byte a = sc.nextByte();  
		byte b = sc.nextByte(); 
		byte c = a + b;
		System.out.println("Addition = "+c);
	}
	public static void main(String[]args)
	{		
		SubByte ob = new SubByte();
		
		ob.subByte();
	}
}