import java.util.Scanner; 
class Person 
{
    private String firstName;
    private String lastName;
    private float hight;
    private int age;

    public void setData(String firstName, String lastName,float hight,int age)
	{
        this.firstName = firstName;
        this.lastName = lastName;
        this.hight = hight;
        this.age = age;
    }

    public String getFirstName() 
	{
        return this.firstName;
    }

    public String getLastName()
	{
        return this.lastName;
    }
	public float getHight()
	{
        return this.hight;
    }
	public float getAge()
	{
        return this.age;
    }
}

class Professor extends Person 
{
    private int employeeId;
    private String sub;
    private float salary;

    public void setData(String firstName, String lastName,float hight, int age, int employeeId, String sub,float salary) 
	{
        this.setData(firstName, lastName,hight,age);
        this.employeeId = employeeId;
        this.sub = sub;
		this.salary = salary;
    }

    public int getEmployeeId()
	{
        return employeeId;
    }

    public String getSub()
	{
        return sub;
    }
	public float getSalaray()
	{
        return this.salary;
    }
}

class Main 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Professor ob = new Professor();
		
		String firstName,lastName,sub;
		float hight;
		
		System.out.println("Enter Employee firstName");
		firstName = sc.nextLine();
		
		System.out.println("Enter Employee lastName");
		lastName = sc.nextLine();
		
		System.out.println("Enter Employee Hight");
		hight = sc.nextFloat();
		
		System.out.println("Enter Employee Age");
		int age = sc.nextInt();
		
		System.out.println("Enter employee Id");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter job Readed sub");
		sub = sc.nextLine();
		
		System.out.println("Enter Salary");
		float salary = sc.nextFloat();
	
		ob.setData(firstName,lastName,hight,age,id,sub,salary);
		System.out.println("Name = "+ob.getFirstName()+"\nLast Name = "+ob.getLastName()+"\nHight = "+ob.getHight()+"\nAge = "+ob.getAge()+"\nEmployee Id = "+ob.getEmployeeId()+"\nJob Title = "+ob.getSub());
    }
}