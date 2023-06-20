import java.util.Scanner;
class DayYear
{
	private int day;
	
	public void setData(int day)
	{
		this.day=day;
	}
	public int getData()
	{
		return this.day;
	}
	public int dayYear()
	{
		int year = day/365;
		 day = day%365;	  
		int month = day/30;
		day = day%30;

		int week = day/7;
		day = day%7;
		return year;
	}
	
	public int dayYear(char ch)
	{
		int year = day/365;  
		int month = day/30;
		int week = day/7;		
		if(ch=='y') return year;
			
		else if(ch=='m') return month;
			
		else if(ch=='w') return week;
			
		else return day;		
	}
}

class Test
{
	public static void main(String []arg)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter day:  ");
		int day = sc.nextInt();
		DayYear	ob = new DayYear();
		ob.setData(day);
		System.out.println(ob.dayYear('w'));
	}
}