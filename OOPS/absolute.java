import java.util.Scanner;
class Absolute
{
	private int n;
	public void setData(int n)
	{
		this.n = n;
	}
	public int getData()
	{
		return this.n;
	}
	public int absolute()
	{
		int num=this.n;
		if(num>=0)
		{	  
		  return num;
		}
		else
		{
		   num = ~num;  
		   num = num+1;
		   return num;
		}	
	}
}
class Test
{	
	public static void main(String []args)
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		Absolute ob = new Absolute();
		ob.setData(n);
		System.out.println(ob.absolute());
	}
}