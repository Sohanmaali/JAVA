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
	//Multiplaction Four numpublic 
	int multi(int a,int b,int c,int d)
	{
		return this.multi(a,b,c)*d;
	}
	//Division two num
	public int division(int a,int b)
	{
		return a/b;
	}
	//Division Three num
	public int division(int a,int b,int c)
	{
		return this.division(a,b)/c;
	}
	//Division Four numpublic 
	public int division(int a,int b,int c,int d)
	{
		return this.division(a,b,c)/d;
	}
	public int operation()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\t1 For 2 Numbers operation\n\t2 For 3 Numbers operation\n\t3 For 4 Numbers operation");
		int choice = sc.nextInt();
		switch (choice)
		{
			case 1:
				takeElement1(sc);
				break;
			case 2:
				takeElement2(sc);
				break;
			case 3:
				takeElement3(sc);
				break;
			default :
				System.out.println("Invalide Input");
		}
		return 0;
	}
	public void takeElement1(Scanner sc)
	{
		System.out.println("First number");
		int a = sc.nextInt();
		System.out.println("Second number");
		int b = sc.nextInt();
		System.out.println("\t1 For Addition\n\t2 For Subtraction\n\t3 For Multiplaction\n\t4 For Division");
		int choice = sc.nextInt();
		int x;
		switch(choice)
		{
			case 1:
				x = add(a,b);
				System.out.println("Addition = "+x);
				break;
			case 2:
				x = sub(a,b);
				System.out.println("Subtraction = "+x);
				break;
			case 3:
				x = multi(a,b);
				System.out.println("Multiplaction = "+x);
				break;
			case 5:
				x = division(a,b);
				System.out.println("Division = "+x);
				break;
			default :
				System.out.println("Invalide Input");
		}
	}
	public void takeElement2(Scanner sc)
	{
		System.out.println("First number");
		int a = sc.nextInt();
		System.out.println("Second number");
		int b = sc.nextInt();
		System.out.println("Third number");
		int c = sc.nextInt();
		System.out.println("\t1 For Addition\n\t2 For Subtraction\n\t3 For Multiplaction\n\t4 For Division");
		int choice = sc.nextInt();
		int x;
		switch(choice)
		{
			case 1:
				x = add(a,b,c);
				System.out.println("Addition = "+x);
				break;
			case 2:
				x = sub(a,b,c);
				System.out.println("Subtraction = "+x);
				break;
			case 3:
				x = multi(a,b,c);
				System.out.println("Multiplaction = "+x);
				break;
			case 5:
				x = division(a,b,c);
				System.out.println("Division = "+x);
			default :
				System.out.println("Invalide Input");
		}
	}
	public void takeElement3(Scanner sc)
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
				 x = add(a,b,c,d);
				System.out.println("Addition = "+x);
				break;
			case 2:
				 x = sub(a,b,c,d);
				System.out.println("Subtraction = "+x);
				break;
			case 3:
				 x = multi(a,b,c,d);
				System.out.println("Multiplaction = "+x);
				break;
			case 4:
				 x = division(a,b,c,d);
				System.out.println("Division = "+x);
				break;
			default :
				System.out.println("Invalide Input");
		}
	}
	public static void main(String args[])
	{
		Calculater ob = new Calculater();
		ob.operation();
	}
}