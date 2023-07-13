import java.util.Scanner;
//   Sahi nahi he OOPS ke Anusar
class Pojo {
	double a, b, c, d;
	public Pojo()
	{
		this.a = 0.0;
		this.b = 0.0;
		this.c = 0.0;
		this.d = 0.0;
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

interface ThreeNum {

	public abstract void operation();
}

class Operation {
	public void choice(Pojo pojo) {
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			double a, b, c;
			System.out.println("Your choice are ");
			System.out.println("\t 1 For Addition");
			System.out.println("\t 2 For Subtraction");
			System.out.println("\t 3 For Multiplaction");
			System.out.println("\t 4 For Division");
			System.out.println("\t 5 For Moduls");
			System.out.println("\t 6 For Square");
			System.out.println("\t 7 For Cube");
			System.out.println("\t 8 For Power");
			System.out.println("\t 15 For Exit");
			System.out.println("Enter your choice ");
			choice = sc.nextInt();
			switch (choice) {
				case 1:
					do {
						System.out.println("\t1 For Two Number");
						System.out.println("\t2 For Three Number");
						System.out.println("\t14 For Back");
						System.out.println("Enter your choice ");
						choice = sc.nextInt();
						switch (choice) {
							case 1:
								System.out.println("Enter two Number");
								a = sc.nextDouble();
								b = sc.nextDouble();
								pojo.setA(a);
								pojo.setB(b);
								DataClass add = new DataClass() {
									@Override
									public void operation() {
										System.out.println(pojo.getA() + pojo.getB());
									}
								};
								add.operation();
								break;
							case 2:
								System.out.println("Enter Three Number");
								a = sc.nextDouble();
								b = sc.nextDouble();
								c = sc.nextDouble();
								pojo.setA(a);
								pojo.setB(b);
								pojo.setC(c);
								DataClass add1 = new DataClass() {
									@Override
									public void operation() {
										System.out.println(pojo.getA() + pojo.getB() + pojo.getC());
									}
								};
								add1.operation();
								break;
						}
					} while (choice != 14);
					break;

				case 2:
					do {
						System.out.println("\t1 For Two Number");
						System.out.println("\t2 For Three Number");
						System.out.println("Enter your choice ");
						choice = sc.nextInt();
						switch (choice) {
							case 1:
								System.out.println("Enter two Number");
								a = sc.nextDouble();
								b = sc.nextDouble();
								pojo.setA(a);
								pojo.setB(b);
								DataClass sub = new DataClass() {
									@Override
									public void operation() {
										System.out.println(pojo.getA() - pojo.getB());
									}
								};
								sub.operation();
								break;
							case 2:
								System.out.println("Enter Three Number");
								a = sc.nextDouble();
								b = sc.nextDouble();
								c = sc.nextDouble();
								pojo.setA(a);
								pojo.setB(b);
								pojo.setC(c);
								DataClass sub1 = new DataClass() {
									@Override
									public void operation() {
										System.out.println(pojo.getA() - pojo.getB() - pojo.getC());
									}
								};
								sub1.operation();
								break;
						}
					} while (choice != 14);
					break;
				case 3:
					do {
						System.out.println("\t1 For Two Number");
						System.out.println("\t2 For Three Number");
						System.out.println("Enter your choice ");
						choice = sc.nextInt();
						switch (choice) {
							case 1:
								System.out.println("Enter two Number");
								a = sc.nextDouble();
								b = sc.nextDouble();
								pojo.setA(a);
								pojo.setB(b);
								DataClass multi = new DataClass() {
									@Override
									public void operation() {
										System.out.println(pojo.getA() * pojo.getB());
									}
								};
								multi.operation();
								break;
							case 2:
								System.out.println("Enter Three Number");
								a = sc.nextDouble();
								b = sc.nextDouble();
								c = sc.nextDouble();
								pojo.setA(a);
								pojo.setB(b);
								pojo.setC(c);
								DataClass multi1 = new DataClass() {
									@Override
									public void operation() {
										System.out.println(pojo.getA() * pojo.getB() * pojo.getC());
									}
								};
								multi1.operation();
								break;
						}
					} while (choice != 14);
					break;
				case 4:
					do {
						System.out.println("\t1 For Two Number");
						System.out.println("\t2 For Three Number");
						System.out.println("Enter your choice ");
						choice = sc.nextInt();
						switch (choice) {
							case 1:
								System.out.println("Enter two Number");
								a = sc.nextDouble();
								b = sc.nextDouble();
								pojo.setA(a);
								pojo.setB(b);
								DataClass div = new DataClass() {
									@Override
									public void operation() {
										System.out.println(pojo.getA() / pojo.getB());
									}
								};
								div.operation();
								break;
							case 2:
								System.out.println("Enter Three Number");
								a = sc.nextDouble();
								b = sc.nextDouble();
								c = sc.nextDouble();
								pojo.setA(a);
								pojo.setB(b);
								pojo.setC(c);
								DataClass div1 = new DataClass() {
									@Override
									public void operation() {
										System.out.println(pojo.getA() / pojo.getB() / pojo.getC());
									}
								};
								div1.operation();
								break;
						}
					} while (choice != 14);
					break;
				case 5:

					System.out.println("Enter two Number");
					a = sc.nextDouble();
					b = sc.nextDouble();
					pojo.setA(a);
					pojo.setB(b);
					DataClass mod = new DataClass() {
						@Override
						public void operation() {
							System.out.println(pojo.getA() % pojo.getB());
						}
					};
					mod.operation();

					break;
				case 6:
					System.out.println("Enter any Number");
					a = sc.nextDouble();

					pojo.setA(a);

					DataClass pow = new DataClass() {
						@Override
						public void operation() {
							System.out.println(pojo.getA() * pojo.getA());
						}
					};
					pow.operation();
					break;
				case 7:
					System.out.println("Enter any Number");
					a = sc.nextDouble();
					pojo.setA(a);

					DataClass squre = new DataClass() {
						@Override
						public void operation() {
							System.out.println(pojo.getA() * pojo.getA() * pojo.getA());
						}
					};
					squre.operation();
					break;
				case 8:
					
					System.out.println("Enter two Number");
					a = sc.nextDouble();
					b = sc.nextDouble();
					pojo.setA(a);
					pojo.setB(b);
					DataClass pow1 = new DataClass() {
						@Override
						public void operation() {
							System.out.println(Math.pow(pojo.getA(), pojo.getB()));
						}
					};
					pow1.operation();
					
					break;
			}
		} while (choice != 15);
	}
}

public class Calculator {

	public static void main(String[] args) {
		Pojo a = new Pojo();
		Operation op = new Operation();
		op.choice(a);
	}
}
