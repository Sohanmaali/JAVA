import java.text.DecimalFormat;
import java.util.Scanner; 
class Area 
{
	static int count = 0;
	private int l;
	private int b;

	public void setData(int l,int b)	
	{
		this.l = l;
		this.b = b;
	}
	public int a()	
	{
		return this.l*this.b;    
	}
}

class Volume extends Area
{
	private int h;
	
	public void setData(int l,int b,int h)	
	{
		this.setData(l,b);    
		this.h = h;    
	}
	public int volume()
	{
		return this.a()*this.h; 
	}
}

class Density extends Volume
{
	double m;
	public void setData(int l,int b,int h,double m)	
	{
		this.setData(l,b,h);
		this.m = m;    
	}
	public double m()
	{
		return this.m / this.volume(); 
	}
}

class Test
{
	public static void main(String t[])
	{	
		Density ob = new Density();
		/* ob.setData(5,3);
		ob.setData(5,3,2);
		System.out.println("Area = "+ob.a()); */
		ob.setData(7,4,6,497.5);
		DecimalFormat round = new DecimalFormat("#.###");
		
		System.out.printf("Volume = %.4f",ob.m());
		
		System.out.println("\nVolume = "+round.format(ob.m()));
	}
}