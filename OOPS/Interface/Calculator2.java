import java.util.Scanner;

class Pojo {
	double a, b, c, d;
	public Pojo()
	{
	}
	public Pojo(double a)
	{
		this.a = a;
	}
	public Pojo(double a, double b)
	{
		this.a = a;
		this.b = b;
	}
	public Pojo(double a, double b,double c)
	{
		this.a = a;
		this.b = b;
		this.c =c;
	}
	public Pojo(double a, double b,double c,double d)
	{
		this.a = a;
		this.b = b;
		this.c =c;
		this.d = d;
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	public double getD() {
		return d;
	}
	public void setD(double d) {
		this.d = d;
	}
}

interface DataClass {

	public abstract double operation(double a, double b);
	//public abstract double operatio(double a);
}

class Operation {
	
	DataClass add = new DataClass() {
		@Override
		public double operation(double a,double b) {
			return a+b;
			
		}
	};
	DataClass sub = new DataClass() {
		@Override
		public double operation(double a,double b) {
			return a-b;
		
		}
	};
	DataClass multi = new DataClass() {
		@Override
		public double operation(double a,double b) {
			return a*b;
			
		}
	};
	DataClass div = new DataClass() {
		@Override
		public double operation(double a,double b) {
			return a/b;
			
		}
	};
	DataClass mod = new DataClass() {
		@Override
		public double operation(double a,double b) {
			return a%b;
			
		}
	};
	DataClass pow1 = new DataClass() {
		@Override
		public double operation(double a,double b) {
			return Math.pow(a,b);
		}
	};
}

public class Calculator1 {

	public void choice() {
		Scanner sc = new Scanner(System.in);
		Operation op = new Operation();
		
		int choice;
		do {
			double a, b, c,res;
			System.out.println("Your choice are ");
			System.out.println("\t 1 For Addition");
			System.out.println("\t 2 For Subtraction");
			System.out.println("\t 3 For Multiplaction");
			System.out.println("\t 4 For Division");
			System.out.println("\t 5 For Moduls");
			System.out.println("\t 6 For Power");
			System.out.println("\t 7 For Exit");
			System.out.println("Enter your choice ");
			choice = sc.nextInt();
			switch (choice) {
				case 1:
					
					System.out.println("Enter two Number");
					a = sc.nextDouble();
					b = sc.nextDouble();
					Pojo pojo = new Pojo(a,b);
					res = op.add.operation(pojo.getA(),pojo.getB());
				System.out.println("Addition = "+res);
					
					break;
				case 2:
					
					System.out.println("Enter two Number");
					a = sc.nextDouble();
					b = sc.nextDouble();
					 pojo = new Pojo(a,b);
					res = op.sub.operation(pojo.getA(),pojo.getB());
					System.out.println("Subtraction = "+res);
					break;
				case 3:
					
					System.out.println("Enter two Number");
					a = sc.nextDouble();
					b = sc.nextDouble();
					 pojo = new Pojo(a,b);
					res = op.multi.operation(pojo.getA(),pojo.getB());
					System.out.println("Multiplaction = "+res);
					break;
					
				case 4:
					System.out.println("Enter two Number");
					a = sc.nextDouble();
					b = sc.nextDouble();
					 pojo = new Pojo(a,b);
					res = op.div.operation(pojo.getA(),pojo.getB());
					System.out.println("Division = "+res);
					break;
					
				case 5:

					System.out.println("Enter two Number");
					a = sc.nextDouble();
					b = sc.nextDouble();
					
					pojo = new Pojo(a,b);
					res = op.mod.operation(pojo.getA(),pojo.getB());
					System.out.println("Moduls = "+res);
					break;
					
				case 6:
					System.out.println("Enter two Number");
					a = sc.nextDouble();
					b = sc.nextDouble();
					pojo = new Pojo(a,b);
					
					//Pojo pojo = new Pojo(a,b);
					res = op.pow1.operation(pojo.getA(),pojo.getB());
					System.out.println("Power = "+res);
					break;					
			}
		} while (choice != 7);
	}

	public static void main(String[] args) {
		
		Calculator1 cl = new Calculator1();
		cl.choice();
	}
}
