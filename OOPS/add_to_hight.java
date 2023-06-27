import java.util.Scanner; 

class DataClass //POJOCLASS
{
	private int feet;
	private int inch;
	
	public void setData(int feet,int inch)
	{
		this.feet = feet;
		this.inch = inch;
	}
	public int getFeet()
	{
		return this.feet ;
	}
	public int getinch()
	{
		return this.inch ;
	}
}
class operation //BL
{
	public void Print(DataClass ob,DataClass ob1)
	{
		int feet = ob.getFeet()+ob1.getFeet();
		int inch = ob.getinch()+ob1.getinch();
		System.out.println("Feet = "+feet+"\nInch = "+inch);
	}
}

class Hight   //Main class OR Cilnt Class
{
	public static void main(String args[])
	{
		DataClass ob = new DataClass();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Feet And inch");
		int feet,inch;
		feet = sc.nextInt();
		inch = sc.nextInt();
		ob.setData(feet,inch);
		
		DataClass ob1 = new DataClass();
		System.out.println("Enter Feet And inch");
		feet = sc.nextInt();
		inch = sc.nextInt();
		ob1.setData(feet,inch);
		
		operation ob2 = new operation();
	
		ob2.Print(ob,ob1);
	}
}