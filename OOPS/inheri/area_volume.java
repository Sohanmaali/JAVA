import java.util.Scanner; 
class Area 
{
	int l;
	int b;
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

class Test
{
	public static void main(String t[])
	{	
		Volume ob = new Volume();
		//ob.setData(5,3);
		ob.setData(5,3,2);
		System.out.println("Area = "+ob.a());
		System.out.println("Volume = "+ob.volume());
	}
}