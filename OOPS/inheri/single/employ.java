class Person 
{
    private String firstName;
    private String lastName;

    public void setData(String firstName, String lastName)
	{
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() 
	{
        return firstName;
    }

    public String getLastName()
	{
        return lastName;
    }
}

class Employee extends Person 
{
    private int employeeId;
    private String jobTitle;

    public void setData(String firstName, String lastName, int employeeId, String jobTitle) 
	{
        this.setData(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    public int getEmployeeId()
	{
        return employeeId;
    }

    public String getLastName()
	{
        return getLastName();
    }
}

class Main 
{
    public static void main(String[] args)
	{
		Employee ob = new Employee();
		ob.setData("sohan", "maali", 101, "HR");
		System.out.println(ob.getFirstName() + " " + ob.getLastName() + " (" + ob.getEmployeeId() + ")");
	  
		Employee ob2 = new Employee();
		ob2.setData("sohan1", "maali1", 1002, "Software engeniyar");
		System.out.println(ob2.getFirstName() + " " + ob2.getLastName() + " (" + ob2.getEmployeeId() + ")");
    }
}
