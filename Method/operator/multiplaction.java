import java.util.Scanner; 

// Multiplaction integer value

class Multi
{
	public void multiInt()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any two number ");
		int a = sc.nextInt();  
		int b = sc.nextInt(); 
		int c = a * b;
		System.out.println("Multiplaction = "+c);
	}
	public void multiFloat()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any two number ");
		float a = sc.nextFloat();  
		float b = sc.nextFloat(); 
		float c = a * b;
		System.out.println("Multiplaction = "+c);
	}
	public void multiDouble()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any two number ");
		double a = sc.nextDouble();  
		double b = sc.nextDouble(); 
		double c = a * b;
		System.out.println("Multiplaction = "+c);
	}
	public void multiLong()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any two number ");
		long a = sc.nextLong();  
		long b = sc.nextLong(); 
		long c = a * b;
		System.out.println("Multiplaction = "+c);
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1 For integer multiplaction\n2 For Float multiplaction\n3 For Double multiplaction\n4 For long multiplaction");
		int choice = sc.nextInt();
		
		Multi ob = new Multi();
		switch(choice)
		{
			case 1:
				ob.multiInt();
				break;
			case 2:
				ob.multiFloat();
				break;
			case 3:
				ob.multiDouble();
				break;
			case 4:
				ob.multiLong();
				break;
		}
	}	
}