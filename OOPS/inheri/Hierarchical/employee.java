class Employee 
{
	double salary;
	String name;
	float time;
	public Employee()
	{
		this.salary = 0;
		this.name = "";
		this.time = 0.0f;
	}
	public Employee(double salary,String name,float time)
	{
		this.salary = salary;
		this.name = name;
		this.time = time;
	}
	void showDitails() 
	{
		System.out.println("Employee Name: "+this.name);
		System.out.println("Employee time: "+this.time);
		System.out.println("Employee Salary: Rs."+this.salary);
	}
}

class FullTimeEmployee extends Employee
{
	public FullTimeEmployee(double salary,String name,float time)
	{
		super(salary,name,time);
	}
	void showFull() 
	{
		super.showDitails();
	}
}

class HuffTimeEmployee extends Employee
{
	public HuffTimeEmployee(double salary,String name,float time)
	{
		super(salary,name,time);
	}
	void showFull() 
	{
		super.showDitails();
	}
}

class Main 
{
	public static void main(String[] args) 
	{
		FullTimeEmployee emp1 = new FullTimeEmployee(50000000,"SOHAN",6f);
		HuffTimeEmployee emp2 = new HuffTimeEmployee(5000,"KPL",2f);
		
		System.out.println("FULL TIME EMPLOYEE");
		emp1.showFull();
		System.out.println("\nPART TIME EMPLOYEE");
		emp2.showFull();		
	}
}