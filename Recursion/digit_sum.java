
import java.util.Scanner;

class DigitSum
{
	public int digiSum(int n)
	{
		int sum = 0;
		if(n>0)
		{
			sum = n%10+digiSum(n/10);
		}
		return sum;
	}
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any num");
		
		int n = sc.nextInt();
		
		DigitSum ob = new DigitSum();
		
		System.out.println("sum of Input digit number = "+ob.digiSum(n));
	}
}		
