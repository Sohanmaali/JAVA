//Reverse

import java.util.Scanner;
class Reverse
{
  public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int n = sc.nextInt();
		int rev=0;
		
		for(;n>0;n/=10)
		{
			int rem = n%10;
			rev = rev*10+rem;
		}
		System.out.println("Reverse = "+rev);
	}
}		
