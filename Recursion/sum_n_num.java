
import java.util.Scanner;
class SumNumber
{
	public int sum(int n)
	{
		int sum = 0;
		if(n == 1)
		{
			return n;
		}
		else 
		{
			sum = n+sum(n-1);
		}
		return sum;
	}
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any num");
		
		int n = sc.nextInt();
		
		SumNumber ob = new SumNumber();
		
		System.out.println("sum of N numbers = "+ob.sum(n));
	}
}		
