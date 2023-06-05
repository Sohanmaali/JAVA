// Eligibal for voting


import java.util.Scanner;
class Voting
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
	else if(age>=18)
	{
		System.out.println("Eligibal for voting");
	}
	else
	{
		System.out.println("Not Eligibal for voting");
	}	
  }
}