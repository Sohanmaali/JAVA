package package1;

public class Area {
	double side1,side2;
	public Area()
	{
		
	}
	public Area(double side1, double side2)
	{
		this.side1 = side1;
		this.side2 = side2;
	}
	
	public double rectangleArea()
	{
		return this.side1*this.side2;
	}

	/*
	public double circleArea(double side1)
	{
		return 3.14*side1*side1;
	}

	public double squareArea(double side1)
	{
		return side1*side1;
	}

	public double trangleArea(double side1,double side2)
	{
		return (side1*side2)/2;
	}
	
	
	public double rhombusArea(double side1, double side2)
	{
		return (side1*side2)/2;
	}
	
	public double peralloArea(double side1, double side2)
	{
		return side1*side2;
	}
	 */
	
}