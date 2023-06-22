import java.util.Scanner; 

class DataClass
{
	private int hr;
	private int mint;
	private int sec;
	
	public void setData(int hr,int mint,int sec)
	{
		this.hr = hr;
		this.mint = mint;
		this.sec = sec;
	}
	public void Print()
	{
		System.out.println("Houese = "+this.hr+"\nMint = "+this.mint+"\nSec = "+this.sec);
	}
	public void sum(DataClass ob,DataClass ob1)
	{
		this.hr = ob.hr+ob1.hr;
		this.mint = ob.mint+ob1.mint;
		this.sec = ob.sec+ob1.sec;
		if(this.sec>=60)
		{
			this.mint += this.sec/60;
			this.sec = this.sec%60;
		}
		if(this.mint>=60)
		{
			this.hr += this.mint/60;
			this.mint = this.mint%60;
		}
	}
}

class Time
{
	public static void main(String args[])
	{
		DataClass ob = new DataClass();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter hour,mint,sec");
		int hr,mint,sec;
		hr = sc.nextInt();
		mint = sc.nextInt();
		sec = sc.nextInt();
		ob.setData(hr,mint,sec);
		
		DataClass ob1 = new DataClass();
		System.out.println("Enter hour,mint,sec");
		hr = sc.nextInt();
		mint = sc.nextInt();
		sec = sc.nextInt();
		ob1.setData(hr,mint,sec);
		
		DataClass ob2 = new DataClass();
		ob2.sum(ob,ob1);
		ob2.Print();
	}
}