class Pertion
{
	String name;
	int age;
	String gen;
	public Pertion()
	{
		this.name = "";
		this.age = 0;
		this.gen = "";
	}
	public Pertion(String name,int age,String gen)
	{
		this.name = name;
		this.age = age;
		this.gen = gen;
	}
	public void show() {
		System.out.println("Name = "+this.name);
		System.out.println("Gender = "+this.gen);
		System.out.println("Age = "+this.age);
	}
}
class Employee extends Pertion
{
	int id;
	double salery;
	public Employee ()
	{
		this.id  = 0;
		this.salery = 0;
	}
	public Employee (String name,int id,int age, double salery,String gen)
	{
		super(name,age,gen);
		this.id  = id;
		this.salery = salery;
	}
	public void showEmployee()
	{
		super.show();
		System.out.println("ID = "+this.id);
		System.out.println("Salery = "+this.salery);
	}
}
class Manager extends Employee
{
	String knowledge = "Good Knowledge";
	String skill = "Good Skill";
	public Manager()
	{
		super();
		this.knowledge = "Good Knowledge";
		this.skill = "Good Knowledge";
	}
	public Manager(String name,int id,int age,double salery,String gen)
	{
		super(name,id,age,salery,gen);
	}
	public void showManege()
	{
		super.showEmployee();
		System.out.println("Knowledge = "+this.knowledge);
		System.out.println("skill = "+this.skill);
	}
}

class  MainClass
{
	public  static  void  main(String args[])
	{
		Manager ob = new Manager("SOHAN",1234,21,550000,"male");
		ob.showManege();
	}
}