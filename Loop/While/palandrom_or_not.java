
//WAP to Palandrom of any number

import java.util.Scanner;
class Palandrom
{
	public static void main(String[]args)                                  
	{
		int n,rev=0,rem;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();
		int temp = n;
		while (n>0)
		{
			rem = n%10;
			
			rev = rev*10+rem;
			
			n/=10;
		}
		if(rev==temp)
		{
			System.out.println("Enter num is palandrom");
		}
		else 
		{
			System.out.println("Enter num is not palandrom");
		}
	}
}
