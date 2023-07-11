import java.util.Scanner;

abstract class Shap {

	public abstract void area();
}

abstract class TwoD extends Shap {
	double a, b;

	public TwoD() {
		this.a = 0.0f;
		this.b = 0.0f;
	}

	public TwoD(double a) {
		this.a = a;
	}

	public TwoD(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public abstract void area();
}

class Circle extends TwoD {
	public Circle(double r) {
		super(r);
	}

	public void area() {
		System.out.println("Area of Circle = "+3.14f * super.a * super.a);
	}
	public void diameter(){
		
		System.out.println("diameter = "+2*super.a);
	}
	public void circumference(){
		
		System.out.println("circumference = "+2*3.14*super.a);
	}
}

class Square extends TwoD {
	public Square(double a) {
		super(a);
	}

	public void area() {
		System.out.println(super.a * super.a);
	}
	public void diagonal() {
		System.out.println("diagonal of Square = "+(Math.sqrt(super.a))*super.a);  //bug
	}
}

abstract class Trangel extends TwoD {
	double x, y;

	public Trangel(double x) {
		this.x = x;
	}

	public Trangel(double x, double y) {
		this.x = x;
		this.y = y;

	}

	public abstract void area();
}

class Equilateral extends Trangel {
	public Equilateral(double a) {
		super(a);
	}

	public Equilateral(double x, double y) {
		super(x, y);

	}

	public void area() {
		System.out.println((Math.sqrt(3) / 4) * super.x * super.x);
	}
}

class Isosceles extends Trangel {
	public Isosceles(double a) {
		super(a);
	}

	public Isosceles(double x, double y) {
		super(x, y);
	}

	public void area() {
		System.out.println((super.x * super.y) / 2);
	}
}

class Scalene extends Trangel {
	public Scalene(double height, double base) {
		super(height, base);
	}

	public void area() {
		System.out.println((super.x * this.y) / 2);
	}
}

/* class Rectangle extends TwoD {

} */

// Main Class or Clinte Class
class Main {
	public static void main(String[] args) {
		Shap shap;
		int choice;	
		System.out.println("Enter Your choice");
		Scanner sc = new Scanner (System.in);
		do{
			System.out.println("\nEnter your choice");					
			System.out.println("\t1 for Circle");					
			System.out.println("\t2 for Square");					
			System.out.println("\t3 for Trangel");	
			System.out.println("\t9 for Exit");	
			choice = sc.nextInt();
			switch (choice) {
				case 1:
					do{
						System.out.println("Your choice are");
						System.out.println("\t1 for Area of Circle");
						System.out.println("\t2 For diameter of Circe");
						System.out.println("\t3 For circumference of Circe");
						System.out.println("\t4 For Back");
						choice = sc.nextInt();
						int r;
						switch (choice) {
							case 1:
								System.out.println("Enter redias of circale");
								r = sc.nextInt();
								System.out.println("Area of Circle");
								Circle cir = new Circle(r);
								cir.area();
								break;
							case 2:
								System.out.println("Enter redias of circale");
								r = sc.nextInt();
								cir = new Circle(r);
								cir.diameter();
								break;
							case 3:
								System.out.println("Enter redias of circale");
								r = sc.nextInt();
								cir = new Circle(r);
								cir.circumference();
								break;
							case 9:
								System.exit(0);
						}
					}while(choice!=4);
					break;
				case 2:
					do {
						System.out.println("Your choice are");
						System.out.println("\t1 for Area of Square");
						System.out.println("\t2 For diagonal of Square");
						System.out.println("\t4 For Back");
						choice = sc.nextInt();
						switch (choice) {
							case 1:
								System.out.println("Enter one side of Square");
								Float a = sc.nextFloat();
								Square sqr = new Square(a);
								sqr.area();
								break;
							case 2:
								System.out.println("Enter one side of Square");
								a = sc.nextFloat();
								sqr = new Square(a);
								sqr.diagonal();
								break;
						}
					} while (choice!=4);
					break;
				case 3:
					do{
						System.out.println("Enter your choice");					
						System.out.println("\t1 for Equilateral Trangel");					
						System.out.println("\t2 for Isosceles Trangel");					
						System.out.println("\t3 for Scalene Trangel");
						System.out.println("\t4 For Back");					
						choice = sc.nextInt();
						switch (choice) {
							case 1:
								System.out.println("Enter value 1");		
								float a = sc.nextFloat();
								Equilateral eq = new Equilateral(a);
								eq.area();
								break;
							case 2:
								System.out.println("Enter 2 value ");		
								a = sc.nextFloat();
								float b = sc.nextFloat();
								Isosceles is = new Isosceles(a, b);
								is.area();
								break;
							case 3:
								System.out.println("Enter 2 value ");		
								a = sc.nextFloat();
								b = sc.nextFloat();
								Scalene sca = new Scalene(a, b);
								sca.area();
								break;
							case 9:
								System.exit(0);
						}
					}while(choice != 4);
			}
		}while(choice!=9);
	}
}