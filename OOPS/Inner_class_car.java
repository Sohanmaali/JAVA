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
		Student ob = new Student(123,"Sohan",64,"Indore","mp");
		ob.showStudent();
	}
}