package package3;
import package2.Volume;

public class Density extends Volume {
	double side4;
	
	public Density()
	{}

	public Density(double side1,double side2,double side3,double side4)
	{
		super(side1,side2,side3);
		this.side4 = side4;
	}
	
	public double rectDensity()
	{
		return this.side4/super.rectVol();
	}
}