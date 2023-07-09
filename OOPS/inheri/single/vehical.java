//single
import java.util.Scanner;
class Vehicle
{
	double price;
	String brand,color,name;
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	public void setBrand(String brand)
	{
		this.brand = brand;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getBrand()
	{
		return this.brand;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public double getPrice()
	{
		return this.price;
	}
	public String getName()
	{
		return this.name;
	}
	public String getColor()
	{
		return this.color;
	}
}
class Car extends Vehicle 
{
	private String num_plate;
	private int wheel;
	public void setNumPlate(String num_plate)
	{
		this.num_plate = num_plate;
	}
	public String getNumPlate()
	{
		return this.num_plate;
	}
	public void setWheel(int wheel)
	{
		this.wheel= wheel;
	}
	public int getWheel()
	{
		return this.wheel;
	}
	//continue.....
}
class Main
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner (System.in);
		Car ob = new Car();
		ob.setPrice(1700000);
		ob.setBrand("Mahendra");
		ob.setName("Thar");
		ob.setColor("Black");
		ob.setNumPlate("MPf93254");
		ob.setWheel(4);
		
		System.out.println("Name = "+ob.getName());
		System.out.println("Brand = "+ob.getBrand());
		System.out.println("Color = "+ob.getColor());
		System.out.println("price = "+ob.getPrice());
		System.out.println("Wheel = "+ob.getWheel());		
		System.out.println("Num Plat = "+ob.getNumPlate());
		
	}
}
