import java.util.Scanner; 

// Division integer value

class Division
{
	public void divInt()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any two number ");
		int a = sc.nextInt();  
		int b = sc.nextInt(); 
		int c = a / b;
		System.out.println("Division = "+c);
	}
	public void divFloat()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any two number ");
		float a = sc.nextFloat();  
		float b = sc.nextFloat(); 
		float c = a / b;
		System.out.println("Division = "+c);
	}
	public void divDouble()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any two number ");
		double a = sc.nextDouble();  
		double b = sc.nextDouble(); 
		double c = a / b;
		System.out.println("Division = "+c);
	}
	public void divLong()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any two number ");
		long a = sc.nextLong();  
		long b = sc.nextLong(); 
		long c = a / b;
		System.out.println("Division = "+c);
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1 For integer Division\n2 For Float Division\n3 For Double Division\n4 For long Division");
		int choice = sc.nextInt();
		
		Division ob = new Division();
		switch(choice)
		{
			case 1:
				ob.divInt();
				break;
			case 2:
				ob.divFloat();
				break;
			case 3:
				ob.divDouble();
				break;
			case 4:
				ob.divLong();
				break;
		}
	}	
}