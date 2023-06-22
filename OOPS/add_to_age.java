import java.util.Scanner; 

class DataClass
{
	private int feet;
	private int inch;
	
	public void setData(int feet,int inch)
	{
		this.feet = feet;
		this.inch = inch;
		
	}
	public void Print()
	{
		System.out.println("Feet = "+this.feet+"\nInch = "+this.inch);
	}
	public void sum(DataClass ob,DataClass ob1)
	{
		this.feet = ob.feet+ob1.feet;
		this.inch = ob.inch+ob1.inch;
		
		if(this.inch>=12)
		{
			this.feet += this.inch/12;
			this.inch = this.inch%12;
		}
	}
}

class Hight
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
		
		DataClass ob2 = new DataClass();
		ob2.sum(ob,ob1);
		ob2.Print();
	}
}