//Fibbonaci

import java.util.Scanner;
class DataClass
{
	private int year;
	
	public void  setData(int n)
	{
		this.year = n;
	}
	public void leapYear()
	{
		if((this.year%4==0 && this.year%100!=0) || this.year%400==0)
		{
			System.out.println("Enter year is leap Year");
		}
		else
		{
			System.out.println("Enter Year is Normal year");
		}
	}
}
class LeapYear
{
	public void run()
	{
		DataClass ob = new DataClass();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any year");
		int year = sc.nextInt();
		ob.setData(year);
		ob.leapYear();
	}
	public static void main(String[]args)
	{
		LeapYear ob = new LeapYear();
		ob.run();
	}
}		
