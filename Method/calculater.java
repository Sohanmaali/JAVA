import java.util.Scanner;

class Calculater
{
	//add two num
	public int add(int a,int b)
	{
		return a+b;
	}
	//add Three num
	public int add(int a,int b,int c)
	{
		return this.add(a,b)+c;
	}
	//add Four num
	public int add(int a,int b,int c,int d)
	{
		return this.add(a,b,c)+d;
	}
	//sub two num
	public int sub(int a,int b)
	{
		return a-b;
	}
	//sub Three num
	public int sub(int a,int b,int c)
	{
		return this.sub(a,b)-c;
	}
	//sub Four num
	public int sub(int a,int b,int c,int d)
	{
		return this.sub(a,b,c)-d;
	}
	//Multiplaction two num
	public int multi(int a,int b)
	{
		return a*b;
	}
	//Multiplaction Three num
	public int multi(int a,int b,int c)
	{
		return this.multi(a,b)*c;
	}
	//Multiplaction Four num 
	public int multi(int a,int b,int c,int d)
	{
		return this.multi(a,b,c)*d;
	}
	//Division two num
	public double division(int a,int b)
	{
		return a/b;
	}
	//Division Three num
	public double division(int a,int b,int c)
	{
		return this.division(a,b)/c;
	}
	//Division Four num 
	public double division(int a,int b,int c,int d)
	{
		return this.division(a,b,c)/d;
	}
	public int operation()
	{
		Scanner sc = new Scanner(System.in);
		char ch ;
		do{
			System.out.println("\t1 For 2 Numbers operation\n\t2 For 3 Numbers operation\n\t3 For 4 Numbers operation");
			int choice = sc.nextInt();
			double x;
			switch (choice)
			{
				case 1:
					x = takeElement1(sc);
					System.out.println(x);
					break;
				case 2:
					x = takeElement2(sc);
					System.out.println(x);
					break;
				case 3:
					x = takeElement3(sc);
					System.out.println(x);
					break;
				default :
					System.out.println("Invalide Input");
			}
			System.out.println("Do you want to parform more operation");
			ch = sc.next().charAt(0);
		}while(ch == 'y');
		return 0;
	}
	public double takeElement1(Scanner sc)
	{
		System.out.println("First number");
		int a = sc.nextInt();
		System.out.println("Second number");
		int b = sc.nextInt();
		System.out.println("\t1 For Addition\n\t2 For Subtraction\n\t3 For Multiplaction\n\t4 For Division");
		int choice = sc.nextInt();
		//int x;
		switch(choice)
		{
			case 1:
				return add(a,b);
			case 2:
				return sub(a,b);
				
			case 3:
				return multi(a,b);
				
			case 4:
				return division(a,b);
				
			default :
				System.out.println("Invalide Input");
				return 0;
		}
	}
	public double takeElement2(Scanner sc)
	{
		System.out.println("First number");
		int a = sc.nextInt();
		System.out.println("Second number");
		int b = sc.nextInt();
		System.out.println("Third number");
		int c = sc.nextInt();
		System.out.println("\t1 For Addition\n\t2 For Subtraction\n\t3 For Multiplaction\n\t4 For Division");
		int choice = sc.nextInt();
		switch(choice)
		{
			case 1:
				return add(a,b,c);
				
			case 2:
				return sub(a,b,c);
				
			case 3:
				return multi(a,b,c);
				
			case 4:
				return division(a,b,c);
				
			default :
				System.out.println("Invalide Input");
		}
		return 0;
	}
	public double takeElement3(Scanner sc)
	{
		System.out.println("First number");
		int a = sc.nextInt();
		System.out.println("Second number");
		int b = sc.nextInt();
		System.out.println("Third number");
		int c = sc.nextInt();
		System.out.println("Forth number");
		int d = sc.nextInt();
		System.out.println("\t1 For Addition\n\t2 For Subtraction\n\t3 For Multiplaction\n\t4 For Division");
		int choice = sc.nextInt();
		int x;
		switch(choice)
		{
			case 1:
				return add(a,b,c,d);
				
			case 2:
				return sub(a,b,c,d);
				
			case 3:
				 return multi(a,b,c,d);
				
			case 4:
				 return division(a,b,c,d);
				
			default :
				System.out.println("Invalide Input");
		}
		return 0;
	}
	public static void main(String args[])
	{
		Calculater ob = new Calculater();
		ob.operation();
	}
}