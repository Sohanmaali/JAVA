class College
{
	
}
class Branch extends College
{
	String name;
	String sub1;
	String sub2;
	String sub3;
	public Branch()
	{
		this.name = "";
		this.sub1 = "";
		this.sub2 = "";
		this.sub3 = "";
	}
	public Branch(String name,String sub1,String sub2,String sub3)
	{
		this.name = name;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}
	public void showDetails() 
	{
		System.out.println("Name = "+this.name);
		System.out.println("SUB1 = "+this.sub1);
		System.out.println("SUB2 = "+this.sub2);
		System.out.println("SUB3 = "+this.sub3);
	}
}

class Art extends Branch
{
	public Art()
	{
		super();
	}
	public Art(String name,String sub1,String sub2,String sub3)
	{
		super(name,sub1,sub2,sub3);
	}
	public void showDetails()
	{
		super.showDetails();
	}
}

class Cs extends Branch
{
	public Cs(String name, String sub1,String sub2,String sub3)
	{
		super(name,sub1,sub2,sub3);
		
	}
	public void showDetails()
	{
		super.showDetails();
	}
}

class Main 
{
	public static void main(String[] args) 
	{
		Art emp1 = new Art("Barkatullah","art","his","pol");
		Cs emp2 = new Cs("Barkatullah","hindi","english","math");
		System.out.println("art branch Details");
		emp1.showDetails();
		System.out.println("\nCs branch Details");
		emp2.showDetails();		
	}
}