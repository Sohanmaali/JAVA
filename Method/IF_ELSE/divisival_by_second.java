import java.util.Scanner; 

class Divisival
{
	public void divisival()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any two number ");
		int num = sc.nextInt();
		int num1 = sc.nextInt();
		
		if(num%num1==0)
		{
			System.out.println("Divisival by second num");
		}
		else
		{
			System.out.println("Not Divisival by second num");
		}
	}
	public static void main(String args[])
	{
		Divisival ob = new Divisival();
		ob.divisival();
	}
}
