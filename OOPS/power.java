import java.util.Scanner;
class DataClass
{
	private int a,b;
	public void setData(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public int power()
	{
		int p=1;
		for(int i=1;i<=b;p=p*a,i++);
		
		return p;
	}
}
class Power
{	
	public void run()
	{
		DataClass ob = new DataClass();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");	
		int a = sc.nextInt();
		
		System.out.println("Enter base");
		int b = sc.nextInt();	
		
		ob.setData(a,b);
		
		System.out.println("Power="+ob.power());
	}
	public static void main(String args[])
	{
		Power ob=new Power();
		ob.run();
	}
}