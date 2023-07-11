import java.util.Scanner;
class Person
{
	String name;
	int age;
	long ad;
	Account acc;
	Address add;
	
	public Person(String name,int age,long ad,String ifscCode,long account_nu,int hn,String city,String st)
	{
		this.name = name;
		this.age = age;
		this.ad = ad;
		acc = new Account(ifscCode,account_nu);
		add = new Address(hn,city,st);
	}
	public void displayPerson()
	{
		System.out.println("\tPERSON NAME      : "+this.name);
		System.out.println("\tAGE              : "+this.age);
		System.out.println("\tADHAR NUMBER      : "+this.ad);
		acc.displayAccount();
		add.showAdd();
	}
//---------------------------------inner class----------------------------------	
	class Account
	{
		String ifsc_code;
		long account_nu;
		
		public Account(String ifsc_code, long account_nu)
		{
			this.ifsc_code=ifsc_code;
			this.account_nu=account_nu;
		}
		void displayAccount()
		{
			System.out.println("-----------ACCOUNT DETAILS----------------");
			System.out.println("\tIFSC CODE      : "+this.ifsc_code);
			System.out.println("\tACCOUNT NUMBER   : "+this.account_nu);
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
		
		System.out.println("Enter Adhar num");
		long ad = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter IFSC cod");
		String ifscCode = sc.nextLine();
		
		System.out.println("Enter Account num");
		long account_nu = sc.nextLong();
		
		System.out.println("Enter House num");
		int hn = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Citiy");
		String city = sc.nextLine();
		
		System.out.println("Enter State");
		String st = sc.nextLine();
		
		Person p=new Person(name,age,ad,ifscCode,account_nu,hn,city,st);
		p.displayPerson();	
		sc.close();	
	}
}