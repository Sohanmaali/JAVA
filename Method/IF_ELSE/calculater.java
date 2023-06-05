import java.util.Scanner; 

class Calculater
{
	public void add()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two num ");
		int num = sc.nextInt();		
		int num1 = sc.nextInt();		
		int ans = num + num1;
		System.out.println("Addition = "+ans);
	}
	public void sub()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two num ");
		int num = sc.nextInt();		
		int num1 = sc.nextInt();		
		int ans = num - num1;
		System.out.println("Subtraction = "+ans);
	}
	public void multi()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two num ");
		int num = sc.nextInt();		
		int num1 = sc.nextInt();		
		int ans = num * num1;
		System.out.println("Subtraction = "+ans);
	}
	public void div()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two num ");
		int num = sc.nextInt();		
		int num1 = sc.nextInt();		
		int ans = num / num1;
		System.out.println("Subtraction = "+ans);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		Calculater ob = new Calculater();
		
		System.out.println("Your choice are");
		System.out.println("\t1 For Addition\n\t2 For Subtraction\n\t3 For Multiplaction\n\t4 For Division");
		int choice = sc.nextInt();
		switch(choice)
		{
			case 1:
				ob.add();
				break;
			case 2:
				ob.sub();
				break;
			case 3:
				ob.multi();
				break;
			case 4:
				ob.div();
				break;
			default:
				System.out.println("Envalide char");
		}
	}
}
