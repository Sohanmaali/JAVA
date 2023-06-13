import java.util.Scanner; 

class Factorial
{
	public int factorial(int n)
	{
		if(n==1)
		{
			return 1;
		} 
		return n*factorial(n-1);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		
		Factorial ob = new Factorial();
		
		System.out.println("Enter any num");
		int n = sc.nextInt();
		
		System.out.println("Factorial of given number = "+ob.factorial(n));
	}
}