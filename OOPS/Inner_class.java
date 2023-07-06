import java.util.Scanner;
class Student
{
	int roll;
	String name;
	Address add;
	public Student(int roll,String name,int hn,String city, String state)
	{
		this.roll = roll;
		this.name = name;
		add = new Address(hn,city,state);
	}
	public void showStudent()
	{
		System.out.println("Roll = "+this.roll);
		System.out.println("Name = "+this.name);
		this.add.showAdd();
	}
	class Address 
	{
		int hn;
		String city;
		String state;
		Address(int hn,String city, String state)
		{
			this.hn = hn;
			this.city = city;
			this.state = state;
		}
		public void showAdd()
		{
			System.out.println("House = "+this.hn);
			System.out.println("Citiy = "+this.city);
			System.out.println("State = "+this.state);
		}
	}
}
class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter roll num");
		int roll = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Name");
		String name = sc.nextLine();
		
		System.out.println("Enter House num");
		int hn = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Citiy");
		String city = sc.nextLine();
		
		System.out.println("Enter State");
		String st = sc.nextLine();
		
		Student ob = new Student(roll,name,hn,city,st);
		ob.showStudent();
	}
}