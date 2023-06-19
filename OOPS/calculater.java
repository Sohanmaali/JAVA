import java.util.Scanner; 

class DataClass
{
	private double a,b;
	
	public void setData(double a,double b)
	{
		this.a = a;
		this.b = b;
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
	public double mod()
	{
		double ans = 0;
		if(this.b==0)
		{
			System.out.println("Can not be Find Modul by 0 ");
		}
		else
		{
			ans = this.a%this.b;
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
		int choice;
		double x,y;
		do
		{
			System.out.println("\n\tYour choices are");
			System.out.println("\t1 For Addition\n\t2 For Subtraction");
			System.out.println("\t3 For Multiplaction\n\t4 For Division");
			System.out.println("\t5 For Modulas\n\t6 For Exit");
			
			System.out.println("Enter Your choice ");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
					System.out.println("Enter First num ");
					x = sc.nextDouble();
			
					System.out.println("Enter Second num ");
					y = sc.nextDouble();
					
					ob.setData(x,y);
					System.out.println("Addition = "+ob.add());
					break;
				case 2:
					System.out.println("Enter First num ");
					x = sc.nextDouble();
			
					System.out.println("Enter Second num ");
					y = sc.nextDouble();
					
					ob.setData(x,y);
					System.out.println("Subtraction = "+ob.sub());
					break;
				case 3:
					System.out.println("Enter First num ");
					x = sc.nextDouble();
			
					System.out.println("Enter Second num ");
					y = sc.nextDouble();
					
					ob.setData(x,y);
					System.out.println("Multiplaction = "+ob.multi());
					break;
				case 4:
					System.out.println("Enter First num ");
					x = sc.nextDouble();
			
					System.out.println("Enter Second num ");
					y = sc.nextDouble();
					
					ob.setData(x,y);
					System.out.println("Division = "+ob.div());
					break;
				case 5:
					System.out.println("Enter First num ");
					x = sc.nextDouble();
			
					System.out.println("Enter Second num ");
					y = sc.nextDouble();
					
					ob.setData(x,y);
					System.out.println("Modulas = "+ob.mod());
					break;
			}
		}while(choice!=6);
	}
	public static void main(String args[])
	{
		Calculater ob1 = new Calculater();
		ob1.run();
	}
}