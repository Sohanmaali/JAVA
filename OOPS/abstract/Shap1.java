import java.util.Scanner;

abstract class Shape {
	String name;
	double side1;

	public Shape() {
		this.side1 = 0.0;
		this.name = "";
	}

	public Shape(double side1, String name) {
		this.side1 = side1;
		this.name = name;
	}

	public void show() {
		System.out.println("Name = " + this.name);
	}

	public abstract void area();

	public double getSide1() {
		return this.side1;
	}
}

abstract class TwoD extends Shape {

	public TwoD() {
		super();
	}

	public TwoD(double side1, String name) {
		super(side1, name);
	}

	// public abstract void area();

	public abstract void perimeter();
}

abstract class OneSide extends TwoD {
	
	public OneSide(double side1, String name) {
		super(side1, name);
	}

	public OneSide() {
		super();
	}
}

class Circle extends OneSide {
	public Circle() {
		super();
	}

	public Circle(double side1, String name) {
		super(side1, name);
	}

	public void area() {
		super.show();
		System.out.println(3.14 * Math.pow(super.getSide1(),2));
	}

	public void perimeter() {
		System.out.println(2 * 3.14 * super.side1);
	}
}

class Equilateral extends OneSide {
	public Equilateral() {
		super();
	}

	public Equilateral(double side1, String name) {
		super(side1, name);
	}

	public void area() {
		super.show();
		System.out.println((Math.sqrt(3) / 4) * super.getSide1() * super.getSide1());
	}

	public void perimeter() {
		System.out.println(3 * super.getSide1());
	}
}

class Square extends OneSide {
	public Square() {
		super();
	}

	public Square(double side1, String name) {
		super(side1, name);
	}

	public void area() {
		super.show();
		System.out.println(Math.pow(super.getSide1(),2));
	}

	public void perimeter() {
		System.out.println(4 * super.getSide1());
	}
}

class Hexagon extends OneSide {
	public Hexagon() {
		super();
	}

	public Hexagon(double side1, String name) {
		super(side1, name);
	}

	public void area() {
		super.show();
		System.out.println((3 * (Math.sqrt(3))) / 2 * (super.getSide1() * super.getSide1()));
	}

	public void perimeter() {
		System.out.println(6 * super.getSide1());
	}
}

abstract class TwoSide extends TwoD {

	double side2;

	public TwoSide(double side1, Double side2, String name) {
		super(side1, name);
		this.side2 = side2;
	}

	public TwoSide() {
		super();
	}

	public double getSide2() {
		return side2;
	}
	// public abstract void area();
}

class Rectangle extends TwoSide {
	public Rectangle() {
		super();
	}

	public Rectangle(double side1, double side2, String name) {
		super(side1, side2, name);
	}

	public void area() {
		super.show();
		System.out.println(super.getSide1() * super.getSide2());
	}

	public void perimeter() {
		System.out.println(2 * (super.getSide1() + super.getSide2()));
	}
}

class Isosceles extends TwoSide {
	public Isosceles() {
		super();
	}

	public Isosceles(double side1, double side2, String name) {
		super(side1, side2, name);
	}

	public void area() {
		super.show();
		System.out.println(super.getSide1() * super.getSide2() / 2);
	}

	public void perimeter() {
		System.out.println((2 * super.getSide1()) + super.getSide2());
	}
}

class RightAngleTriangle extends TwoSide {
	public RightAngleTriangle() {
		super();
	}

	public RightAngleTriangle(double side1, double side2, String name) {
		super(side1, side2, name);
	}

	public void area() {
		super.show();
		System.out.println(super.getSide1() * super.getSide2() / 2);
	}

	public void perimeter() {
		// dclear
		double x = Math.pow(super.getSide1(), 2d);
		double y = Math.pow(super.getSide2(), 2d);
		System.out.println(super.getSide1() + super.getSide2() + Math.sqrt(x + y));
	}
}

class Parallelogram extends TwoSide {
	public Parallelogram() {
		super();
	}

	public Parallelogram(double side1, double side2, String name) {
		super(side1, side2, name);
	}

	public void area() {
		super.show();
		System.out.println(super.getSide1() * super.getSide2());
	}

	public void perimeter() {

		System.out.println(2 * (super.getSide1() + super.getSide2()));
	}
}

class Rhombus extends TwoSide {
	public Rhombus() {
		super();
	}

	public Rhombus(double side1, double side2, String name) {
		super(side1, side2, name);
	}

	public void area() {
		super.show();
		System.out.println((super.getSide1() * super.getSide2()) / 2);
	}

	public void perimeter() {

		System.out.println(4 * super.getSide1());
	}
}

abstract class ThreeSide extends TwoD {
	
	double side2;
	double side3;

	public ThreeSide(double side1, double side2, double side3, String name) {
		super(side1, name);
		this.side2 = side2;
		this.side3 = side3;
	}

	public ThreeSide() {
		super();
		this.side2 = 0.0;
		this.side3 = 0.0;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}
}

class Scalene extends ThreeSide {
	public Scalene() {
		super();
	}

	public Scalene(double side1, double side2, double side3, String name) {
		super(side1, side2, side3, name);
	}

	public void area() {
		super.show();
		System.out.println((super.getSide1() * super.getSide2()) / 2);
	}

	public void perimeter() {

		System.out.println(super.getSide1() + super.getSide2() + super.getSide3());
	}
}

class Trapezoid extends ThreeSide {
	public Trapezoid() {
		super();
	}

	public Trapezoid(double side1, double side2, double side3, String name) {
		super(side1, side2, side3, name);
	}

	public void area() {
		super.show();
		System.out.println(((super.getSide1() + super.getSide2())) / 2 * super.getSide3());
	}

	public void perimeter() {

		System.out.println(super.getSide1() + super.getSide2() + super.getSide3());
	}

}

abstract class ThreeD extends Shape {

	public ThreeD() {
		super();
	}

	public ThreeD(double side1, String name) {
		super(side1, name);
	}

	// public abstract void cSAarea();

	public abstract void volume();
}

abstract class OneSideOne extends ThreeD {
	// public abstract void perimeter();
	public OneSideOne(double side1, String name) {
		super(side1, name);
	}

	public OneSideOne() {
		super();
	}
	// public abstract void area();
}

class Cube extends OneSideOne {
	public Cube() {
		super();
	}

	public Cube(double side1, String name) {
		super(side1, name);
	}

	public void area() {
		super.show();
		System.out.println(6 * (super.getSide1() * getSide1()));
	}

	public void cSAarea() {
		super.show();
		System.out.println(4 * Math.pow(super.getSide1(),2));
	}

	public void volume() {

		System.out.println(Math.pow(super.getSide1(), 3));
	}

}

class Sphere extends OneSideOne {
	public Sphere() {
		super();
	}

	public Sphere(double side1, String name) {
		super(side1, name);
	}

	public void area() {
		super.show();
		System.out.println(4 * 3.14 * Math.pow(super.getSide1(), 2));
	}
	public void cSAarea() {
		System.out.println(4 * 3.14 * Math.pow(super.getSide1(), 2));
	}
	
	public void volume() {

		System.out.println(4 / 3 * 3.14 * (Math.pow(super.getSide1(), 3d)));
	}
}

class Hemisphere extends OneSideOne {
	public Hemisphere() {
		super();
	}

	public Hemisphere(double side1, String name) {
		super(side1, name);
	}

	public void area() {
		super.show();
		System.out.println(3 * 3.14 * Math.pow(super.getSide1(), 2d));
	}

	public void volume() {

		System.out.println(2 / 3 * 3.14 * (Math.pow(super.getSide1(), 3d)));
	}
}

abstract class TwoSideOne extends ThreeD {

	double side2;

	public TwoSideOne(double side1, double side2, String name) {
		super(side1, name);
		this.side2 = side2;
	}

	public TwoSideOne() {
		super();
	}

	public double getSide2() {
		return side2;
	}
}

class Cylinder extends TwoSideOne {
	public Cylinder() {
		super();
	}

	public Cylinder(double side1, double side2, String name) {
		super(side1, side2, name);

	}

	public void area() {
		super.show();
		System.out.println((2 * 3.14 * super.getSide1() * super.getSide2()) + (2 * 3.14 * super.getSide1() * 2));
	}

	// 2πrh+2πr2
	public void volume() {

		System.out.println(2 / 3 * 3.14 * (Math.pow(super.getSide1(), 3d)));
	}
}

abstract class ThreeSideOne extends ThreeD {

	double side2;
	double side3;

	public ThreeSideOne(double side1, double side2, double side3, String name) {
		super(side1, name);
		this.side2 = side2;
		this.side3 = side3;
	}

	public ThreeSideOne() {
		super();
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}
}

class Cuboid extends ThreeSideOne {
	public Cuboid() {
		super();
	}

	public Cuboid(double side1, double side2, double side3, String name) {
		super(side1, side2, side3, name);

	}

	public void area() {
		super.show();
		System.out.println(super.getSide1() * super.getSide2() + super.getSide2() * super.getSide3()
				+ (super.getSide1() * super.getSide3()));
	}

	// 2πrh+2πr2
	public void volume() {

		System.out.println(super.getSide1() * super.getSide2() * super.getSide3());
	}
}

class Cone extends ThreeSideOne {
	public Cone() {
		super();
	}

	public Cone(double side1, double side2, double side3, String name) {

		super(side1, side2, side3, name);
	}

	public void area() {
		super.show();
		System.out.println(super.getSide1() * super.getSide2() + super.getSide2() * super.getSide3()
				+ super.getSide1() * super.getSide3());
	}

	// 2πrh+2πr2
	public void volume() {

		System.out.println(super.getSide1() * super.getSide2() * super.getSide3());
	}
}
 
// Main Class or Clinte Class
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Your choice are");
		int choice, side1, side2, side3;
		
		System.out.println("1 For Circle");
		System.out.println("2 For Equilateral Trangel");
		System.out.println("3 For Square");
		System.out.println("4 For Hexagon");
		System.out.println("5 For Rectangle");
		System.out.println("6 For Isosceles Trangel");
		System.out.println("7 For Right Angle Triangle");
		System.out.println("8 For Parallelogram");
		System.out.println("9 For Rhombus");
		System.out.println("10 For Scalene");
		System.out.println("11 For Trapezoid");
		System.out.println("12 For Cube");
		System.out.println("13 For Sphere");
		System.out.println("14 For Hemisphere");
		System.out.println("15 For Cylinder");
		System.out.println("16 For Cuboid");
		System.out.println("17 For Cone");
		System.out.println("Enter your choice");
		choice = sc.nextInt();
		switch (choice) {
			case 1:

				System.out.println("Enter First Value");
				side1 = sc.nextInt();
				Circle circle = new Circle(side1, "Circle");
				circle.area();
				circle.perimeter();
				break;
			case 2:
				System.out.println("Enter First Value");
				side1 = sc.nextInt();
				Equilateral equilateral = new Equilateral(side1, "Equilateral Trangel");
				equilateral.area();
				equilateral.perimeter();
				break;
			case 3:
				System.out.println("Enter First Value");
				side1 = sc.nextInt();
				Square square = new Square(side1, "Square ");
				square.area();
				square.perimeter();
				break;
			case 4:
				System.out.println("Enter First Value");
				side1 = sc.nextInt();
				Hexagon hexagon = new Hexagon(side1, "Hexagon");
				hexagon.area();
				hexagon.perimeter();
				break;
			case 5:
				System.out.println("Enter Two Value");
				side1 = sc.nextInt();
				side2 = sc.nextInt();
				Rectangle rectangle = new Rectangle(side1, side2, "Rectangle");
				rectangle.area();
				rectangle.perimeter();
				break;
			case 6:
				System.out.println("Enter Two Value");
				side1 = sc.nextInt();
				side2 = sc.nextInt();
				Isosceles isosceles = new Isosceles(side1, side2, "Isosceles Trangel");
				isosceles.area();
				isosceles.perimeter();
				break;
			case 7:
				System.out.println("Enter Two Value");
				side1 = sc.nextInt();
				side2 = sc.nextInt();
				RightAngleTriangle rat = new RightAngleTriangle(side1, side2, "Right Angle Triangle");
				rat.area();
				rat.perimeter();
				break;
			case 8:
				System.out.println("Enter Two Value");
				side1 = sc.nextInt();
				side2 = sc.nextInt();
				Parallelogram parallelogram = new Parallelogram(side1, side2, "parallelogram");
				parallelogram.area();
				parallelogram.perimeter();
				break;
			case 9:
				System.out.println("Enter Two Value");
				side1 = sc.nextInt();
				side2 = sc.nextInt();
				Rhombus rhombus = new Rhombus(side1, side2, "Rhombus");
				rhombus.area();
				rhombus.perimeter();
				break;
			case 10:
				System.out.println("Enter three Value");
				side1 = sc.nextInt();
				side2 = sc.nextInt();
				side3 = sc.nextInt();
				Scalene scalene = new Scalene(side1, side2, side3, "Scalene Trangel");
				scalene.area();
				scalene.perimeter();
				break;
			case 11:
				System.out.println("Enter three Value");
				side1 = sc.nextInt();
				side2 = sc.nextInt();
				side3 = sc.nextInt();
				Trapezoid trapezoid = new Trapezoid(side1, side2, side3, "Trapezoid");
				trapezoid.area();
				trapezoid.perimeter();
				break;
			case 12:
				System.out.println("Enter First Value");
				side1 = sc.nextInt();
				Cube cube = new Cube(side1, "Cube");
				cube.area();
				cube.volume();
			case 13:
				System.out.println("Enter First Value");
				side1 = sc.nextInt();
				Sphere sphere = new Sphere(side1, "Sphere");
				sphere.area();
				sphere.volume();
				break;
			case 14:
				System.out.println("Enter First Value");
				side1 = sc.nextInt();
				Hemisphere hemisphere = new Hemisphere(side1, "Hemisphere");
				hemisphere.area();
				hemisphere.volume();
				break;
			case 15:
				System.out.println("Enter Two Value");
				side1 = sc.nextInt();
				side2 = sc.nextInt();
				Cylinder cylinder = new Cylinder(side1,side2, "Cylinder");
				cylinder.area();
				cylinder.volume();
				break;
			case 16:
				System.out.println("Enter three Value");
				side1 = sc.nextInt();
				side2 = sc.nextInt();
				side3 = sc.nextInt();
				Cuboid cuboid = new Cuboid (side1,side2,side3, "Cuboid");
				cuboid.area();
				cuboid.volume();
				break;
			case 17:
				System.out.println("Enter three Value");
				side1 = sc.nextInt();
				side2 = sc.nextInt();
				side3 = sc.nextInt();
				Cone cone = new Cone (side1,side2,side3, "cone");
				cone.area();
				cone.volume();
				break;
		}
	}
}