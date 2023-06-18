import java.util.Scanner;

class CheckAge
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		CheckAge ob = new CheckAge();
		ob.setData(age);
		ob.age();
	}
}
class Age
{
	private int age;
	public void setData(int age)
	{
		this.age = age;
	}
	public void age()
	{
		if(age<=0)
		  System.out.println("Invalid age !!!");	 
		else if(age<13)
		    System.out.println("child age");
		else if(age<20)
			System.out.println("teen age");
		else if(age<60) 
			System.out.println("Young age");
		else
			System.out.println("Old age");
	}
}