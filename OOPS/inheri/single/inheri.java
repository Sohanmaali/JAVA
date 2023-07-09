import java.util.Scanner; 
class First 
{
	int a;
	public void setData(int a)	
	{
		this.a=a;
	}
	public int getData()	
	{
		return this.a;
	}
	public int sq()	
	{
		return this.a*this.a;    
	}
}    
class Second extends First
{
	private int b;
	public void setData(int a,int b)	
	{
		this.setData(a);    
		this.b = b;    
	}
	public int sum()
	{
		return this.getData()+this.b; 
	}
}

class Test
{
	public static void main(String t[])
	{	
		Second ob = new Second();
		ob.setData(5,3);
		System.out.println("sum = "+ob.sum());
	}
}
