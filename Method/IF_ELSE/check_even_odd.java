import java.util.Scanner; 

class EvenOdd
{
	public void evenOdd()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number ");
		int num = sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println("Enter number is even");
		}
		else
		{
			System.out.println("Enter number is odd");
		}
	}
	public static void main(String args[])
	{
		EvenOdd ob = new EvenOdd();
		ob.evenOdd();
	}
}
