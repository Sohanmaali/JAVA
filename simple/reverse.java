import java.util.Scanner;
import java.lang.System;
import java.lang.String;
class Reverse
{
	public static void main(String[]args)
	{
		int n1,rem;
		double rev=0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any Four Digit  Num");
		 n1 = sc.nextInt();
		 rem=n1%10;
		 rev=rev*10+rem;
		 n1=n1/10;
		 
		 rem=n1%10;
		 rev=rev*10+rem;
		 n1=n1/10;
		 
		 
		 rem=n1%10;
		 rev=rev*10+rem;
		 n1=n1/10;
		
		 rem=n1%10;
		 rev=rev*10+rem;
		
		 System.out.println("Reverse num : "+rev);
	}
}