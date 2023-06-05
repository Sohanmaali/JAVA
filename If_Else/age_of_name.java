//age criteriya

import java.util.Scanner;
class Age
{
  public static void main(String[]args)                                  
  {
  	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Your age");
  	int age = sc.nextInt();
	
 	if(age<=0)
	{
		System.out.println("Invalid Age !");
	}
	else if(age<=12)
		{
			System.out.println("Child");
		}
	else if(age<20)
	{
		System.out.println("Teen");
	}
	else if(age<60)
	{
		System.out.println("Young");
	}
	else 
	{
		System.out.println("Old");
	}
 }
  
}