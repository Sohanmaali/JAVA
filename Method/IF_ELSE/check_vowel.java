import java.util.Scanner; 

class StDivision
{
	public void stDivision()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your per ");
		char ch = sc.next()charAt(0);		
		
		if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'ch=='I'ch=='o'ch=='O'ch=='u'ch=='U')
		{
			System.out.println("Enter charecter is vowel");
		}
		else
		{
			System.out.println("Enter charecter is Consonent");
		}
		
	}
	public static void main(String args[])
	{
		StDivision ob = new StDivision();
		ob.stDivision();
	}
}
