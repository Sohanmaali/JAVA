import java.util.Scanner; 

class Age
{
	public void age()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any age number ");
		int age = sc.nextInt();		
		
		if(age<=0)
		{
			System.out.println("Invalide age");
		}
		else if(age<=12)
		{
			System.out.println("child");
		}
		else if(age<=19)
		{
			System.out.println("Teen");
		}
		else if(age<=59)
		{
			System.out.println("Young");
		}
		else
		{
			System.out.println("Old");
		}
	}
	public static void main(String args[])
	{
		Age ob = new Age();
		ob.age();
	}
}
