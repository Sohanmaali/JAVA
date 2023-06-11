import java.util.Scanner;

class Calculater1
{
	//add two num
	public int add(int a,int b)
	{
		return a+b;
	}
	
	//sub two num
	public int sub(int a,int b)
	{
		return a-b;
	}
	
	//Multiplaction two num
	public int multi(int a,int b)
	{
		return a*b;
	}
	
	//Division two num
	public int division(int a,int b)
	{
		return a/b;
	}
	public void operation()
	{
		
		char ch = '0';
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number");
		int n = sc.nextInt();
		System.out.println("Enter Second number");
		int x = sc.nextInt();
		
		do
		{
			
			System.out.println("\t1 For Addition\n\t2 Subtraction\n\t3 Multiplaction\n\t4 Division");
			int choice = sc.nextInt();
			switch (choice)
			{
				case 1:
					n = add(n,x);
					System.out.println("Addition = "+n);
					break;
				case 2:
					n = sub(n,x);
					System.out.println("Subtraction = "+n);
					break;
				case 3:
					n = multi(n,x);
					System.out.println("Multiplaction = "+n);
					break;
				case 4:
					n = division(n,x);
					System.out.println("Division = "+n);
					break;
				default :
					System.out.println("Invalide Input");
			}
			System.out.println("do you want to parform more operation y/n :");
			ch = sc.next().charAt(0);
			if(ch == 'y')
			{
				System.out.println("Enter number");
			 x = sc.nextInt();
			}
			else
			{
				break;
			}
		}while(ch=='y');
	}
	public static void main(String args[])
	{
		Calculater1 ob = new Calculater1();
		ob.operation();
	}
}