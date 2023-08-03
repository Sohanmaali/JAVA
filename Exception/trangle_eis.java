
class TrangaleTypeException extends Exception
{
	public TrangaleTypeException(){}
	
	public TrangaleTypeException(String msg)
	{
		super(msg);
	}
}
class Trangale
{
	double side1,side2,side3;
	
	public Trangale(){}
	
	
	public Trangale(double side1,double side2,double side3)
	{
		this.side1 = side1; 
		this.side2 = side2 ;
		this.side3 = side3; 
	}
	public void triangle()throws TrangaleTypeException
	{
		if(this.side1<0||this.side2<0||this.side3<0)
		{
			throw new TrangaleTypeException("Trangale side can not we Zero");
		}
		else if(this.side1==this.side2 && this.side2==this.side3) 
		{
			throw new TrangaleTypeException("Equilateral triangle.");
		}
		else if(this.side1==this.side2 || this.side1==this.side3 || this.side2==this.side3) 
		{
			throw new TrangaleTypeException("Isosceles triangle.");
		}
		else 
		{
			throw new TrangaleTypeException("Scalene triangle.");
		}
	}
}

class Main
{
	public static void main(String[]args)                                  
	{
		try
		{
			double side1 = Integer.parseInt(args[0]);
			double side2 = Integer.parseInt(args[1]);
			double side3 = Integer.parseInt(args[2]);
			Trangale ob = new Trangale(side1,side2,side3);
			ob.triangle();
		}
		catch(NumberFormatException | ArrayIndexOutOfBoundsException | TrangaleTypeException e)
		{
			System.out.println(e.getMessage());
		}
	}
}