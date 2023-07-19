package package2;
import package1.Area;

public class Volume extends Area {
	
	double side3;
	
	public Volume()
	{
		
	}
	public Volume(double side1,double side2,double side3)
	{
		super(side1,side2);
		this.side3 = side3;
	}
	public double rectVol()
	{
		return super.rectangleArea()*this.side3;
	}
}