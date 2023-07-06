import java.util.Scanner;
class Person
{
	String name;
	int age;
	Employ amp;
	Address add;
	
	public Person(String name,int age,int id ,String compmiy,int hn,String city,String st)
	{
		this.name = name;
		this.age = age;
		amp = new Employ(id,compmiy);
		add = new Address(hn,city,st);
	}
	public void displayPerson()
	{
		System.out.println("\tPERSON NAME      : "+this.name);
		System.out.println("\tAGE              : "+this.age);
		amp.displayampount();
		add.showAdd();
	}
//---------------------------------inner class----------------------------------	
	class Employ
	{
		int id;
		String compmiy;
		
		public Employ(int id, String compmiy)
		{
			this.id = id;
			this.compmiy = compmiy;
		}
		void displayampount()
		{
			System.out.println("\tEmploy id      : "+this.id);
			System.out.println("\tCompmiy Name  : "+this.compmiy);
		}
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
			System.out.println("\tHOUSE = "+this.hn);
			System.out.println("\tCITY = "+this.city);
			System.out.println("\tSTATE = "+this.state);
		}
	}
}
class Test
{
	public static void main (String arg[])
	{	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Name");
		String name = sc.nextLine();
		
		System.out.println("Enter Age num");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Employ id");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Compnay name ");
		String compmiy = sc.nextLine();
		
		System.out.println("Enter House num");
		int hn = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Citiy");
		String city = sc.nextLine();
		
		System.out.println("Enter State");
		String st = sc.nextLine();
		
		Person p = new Person(name,age,id,compmiy,hn,city,st);
		p.displayPerson();		
	}
}