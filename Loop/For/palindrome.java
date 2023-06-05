//Palindrome or not

import java.util.Scanner;
class Palindrome
{
  public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int n = sc.nextInt();
		int rev=0;
		int temp = n;
		for(;n>0;n/=10)
		{
			int rem = n%10;
			rev = rev*10+rem;
		}
		if(rev==temp)
		{
			System.out.println("PALINDOME");
		}
		else
		{
			System.out.println("NOT PALINDOME");
		}
	}
}		
