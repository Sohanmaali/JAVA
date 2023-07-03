//single
import java.util.Scanner;
class Mobile
{
	String brand,color;
	float length,weight;
	double price;
	
	public void setBrand(String brand)
	{
		this.brand = brand;
	}
	public String getBrand()
	{
		return this.brand;
	}
	
	public void setPrice (double price)
	{
		this.price = price;
	}
	public double getPrice()
	{
		return this.price;
	}
	public void setColor (String color)
	{
		this.color = color;
	}
	public String getColor()
	{
		return this.color;
	}
	public void setLength (float length)
	{
		this.length = length;
	}
	public float getLength()
	{
		return this.length;
	}
	public void setWeight (float weight)
	{
		this.weight = weight;
	}
	public float getWeight()
	{
		return this.weight;
	}
}
class Android extends Mobile
{
	private int camera;
	private float storage;
	private String lock;
	public void setCamera(int camera)
	{
		this.camera = camera;
	}
	public int getCamera()
	{
		return this.camera;
	}
	public void setStorage(float storage)
	{
		this.storage = storage;
	}
	public float getStorage()
	{
		return this.storage;
	}
	public void setLock(String lock)
	{
		this.lock = lock;
	}
	public String getLock()
	{
		return this.lock;
	}
}

class Main 
{
	public static void main(String []args)
	{
		Android ob = new Android ();
		
		ob.setPrice(25000);
		ob.setBrand("Semsung");
		ob.setLength(6);
		ob.setWeight(400);
		ob.setColor("White");
		ob.setCamera(54);
		ob.setStorage(128);
		ob.setLock("Finger-print");
		System.out.println("Brand : "+ob.getBrand());
		System.out.println("Color : "+ob.getColor());
		System.out.println("Camera : "+ob.getCamera()+" MF");
		System.out.println("Storage : "+ob.getStorage()+" GB");
		System.out.println("Length : "+ob.getLength()+" Inch");
		System.out.println("Weight : "+ob.getWeight()+" Gram");
		System.out.println("Price : "+ob.getPrice()+" /-");
	}
}