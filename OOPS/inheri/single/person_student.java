//single 
import java.util.Scanner;
class Person
{
	String name;
	float height;
	int age;
	int weight;
	String gender;
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setHeight(float height)
	{
		this.height = height;
	}
	public void setWeight(int weight)
	{
		this.weight = weight;
	}
	public void setGender(String gender)
	{	
		this.gender = gender;
	}
	public void setAge(int age)
	{	
		this.age = age;
	}

	public String getName()
	{
		return this.name;
	}
	public float getHeight()
	{
		return this.height;
	}
	public int getWeight()
	{
		return this.weight;
	}
	public int getAge()
	{
		return this.age;
	}
	public String getGender()
	{
		return this.gender;
	}	
}
class Student extends Person
{
	private String clas;
	private double fees ;
	public void setClas(String clas)
	{
		this.clas = clas;
	}
	public String getClas()
	{
		return this.clas;
	}
	public void setFees(double fees)
	{
		this.fees = fees;
	}
	public double getFees()
	{
		return this.fees;
	}
}
class Main
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);	
		Student ob = new Student();
		
		System.out.println("Enter name of Person");
		ob.setName(sc.next());
		
		System.out.println("Enter Height of Person");
		ob.setHeight(sc.nextFloat());
		
		System.out.println("Enter weight of Person");
		ob.setWeight(sc.nextInt());
		
		System.out.println("Enter age of Person");
		ob.setAge(sc.nextInt());
		String gender ;
		do{
			System.out.println("Enter Gender of Person");
			gender = sc.next();
			if(!gender.equals("male") && !gender.equals("female")&&!gender.equals("custom"))
				System.out.println("invalid gender"); 
		}while(!gender.equals("male") && !gender.equals("female")&&!gender.equals("custom")); 
		ob.setGender(gender);
		ob.setClas("10th");
		ob.setFees(9000);	
		System.out.println("Name = "+ob.getName());
		System.out.println("Class = "+ob.getClas());
		System.out.println("gender = "+ob.getGender());
		System.out.println("Age = "+ob.getAge());
		System.out.println("Height = "+ob.getHeight());
		System.out.println("Weight = "+ob.getWeight());
	}	
}