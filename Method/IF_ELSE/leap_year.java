import java.util.Scanner; 

class LeapYear
{
	public void leapYear()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Any year ");
		int year = sc.nextInt();		
		
		if((year%4==0&&year%100!=0)||year%400==0)
		{
			System.out.println("Enter Year is leap Year");
		}
		else
		{
			System.out.println("Enter Year is normal Year");
		}
	}
	public static void main(String args[])
	{
		LeapYear ob = new LeapYear();
		ob.leapYear();
	}
}
