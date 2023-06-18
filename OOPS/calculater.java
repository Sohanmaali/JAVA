import java.util.Scanner; 

class DataClass
{
	private double a,b;
	
	public void setData(double x,double y)
	{
		this.a = x;
		this.b = y;
	}
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
		double ans = 0;
		if(this.b==0)
		{
			System.out.println("Can not be divided by 0 ");
		}
		else
		{
			ans = this.a/this.b;
		}
		return ans;
	}
}

class Calculater
{
	public void run()
	{
		DataClass ob = new DataClass();
		Scanner sc = new Scanner(System.in);
		char ch;
		do
		{
			System.out.println("Enter First num ");
			double x = sc.nextDouble();
			System.out.println("Enter Second num ");
			double y = sc.nextDouble();
			ob.setData(x,y);
			
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
			System.out.println("Do you want to purform more operation y/n");
			ch = sc.next().charAt(0);
		}while(ch=='y');
	}
	public static void main(String args[])
	{
		Calculater ob1 = new Calculater();
		ob1.run();
	}
}