import java.util.Scanner; 
class Person 
{
    private String firstName;
    private String lastName;
    private float hight;

    public void setData(String firstName, String lastName,float hight)
	{
        this.firstName = firstName;
        this.lastName = lastName;
        this.hight = hight;
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
}

class Employee extends Person 
{
    private int employeeId;
    private String jobTitle;

    public void setData(String firstName, String lastName,float hight, int employeeId, String jobTitle) 
	{
        this.setData(firstName, lastName,hight);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    public int getEmployeeId()
	{
        return employeeId;
    }

    public String getjobTitle()
	{
        return jobTitle;
    }
}

class Main 
{
    public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Employee ob = new Employee();
		String firstName,lastName,title;
		float hight;
		System.out.println("Enter Employee firstName");
		firstName = sc.nextLine();
		
		System.out.println("Enter Employee lastName");
		lastName = sc.nextLine();
		
		System.out.println("Enter Employee Hight");
		hight = sc.nextFloat();
		
		System.out.println("Enter employee Id");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter job Title");
		title = sc.nextLine();
	
		ob.setData(firstName,lastName,hight,id,title);
		System.out.println("Name = "+ob.getFirstName()+"\nLast Name = "+ob.getLastName()+"\nHight = "+ob.getHight()+"\nEmployee Id = "+ob.getEmployeeId()+"\nJob Title = "+ob.getjobTitle());
    }
}