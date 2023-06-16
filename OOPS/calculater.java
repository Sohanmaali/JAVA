import java.util.Scanner; 

class DataClass
{
	double a,b;
	
	public double add()
	{
		return this.a+this.b;
	}
	public double sub()
	{
		return this.a-this.b;
	}
	public double multi()
	{
		return this.a*this.b;
	}
	public double div()
	{
		return this.a/this.b;
	}
}

class Calculater
{
	public void choice()
	{
		DataClass ob = new DataClass();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First num ");
		ob.a = sc.nextDouble();
		System.out.println("Enter Second num ");
		ob.b = sc.nextDouble();
		
		System.out.println("\t1 For Addition");
		System.out.println("\t2 For Subtraction");
		System.out.println("\t3 For Multiplaction");
		System.out.println("\t4 For Division");
		System.out.println("Enter Your choice ");
		int choice = sc.nextInt();
		switch(choice)
		{
			case 1:
				System.out.println("Addition = "+ob.add());
				break;
			case 2:
				System.out.println("Subtraction = "+ob.sub());
				break;
			case 3:
				System.out.println("Multiplaction = "+ob.multi());
				break;
			case 4:
				System.out.println("Division = "+ob.div());
				break;
		}
	}
	public static void main(String args[])
	{
		Calculater ob1 = new Calculater();
		ob1.choice();
	}
}