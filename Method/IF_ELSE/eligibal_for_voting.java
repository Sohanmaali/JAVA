import java.util.Scanner; 

class Voting
{
	public void voting()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age number ");
		int age = sc.nextInt();
		
		
		if(age<=0)
		{
			System.out.println("Invalide age");
		}
		else if(age<18)
		{
			System.out.println("You are not Eligibal for voting");
		}
		else
		{
			System.out.println("You are Eligibal for voting");
		}
	}
	public static void main(String args[])
	{
		Voting ob = new Voting();
		ob.voting();
	}
}
