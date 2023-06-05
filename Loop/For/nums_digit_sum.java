//nums sum

import java.util.Scanner;
class DigitSum
{
  public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int n = sc.nextInt();
		int sum=0;
		
		for(;n>0;n/=10)
		{
			int rem = n%10;
			sum+=rem;
		}
		
			
		System.out.println("Sum = "+sum);
	}
}		
