

//A 4 Rversed as of orignal num

import java.util.Scanner;
class Reverse
{
	public static void main(String[]args)
	{
		int num,rev=0,rem;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any  Four Digit num");
		num = sc.nextInt();
		if(num>=1000&&num<10000)
		{
			rem=num%10;
			rev=rev * 10+rem;
			num = num/10;
			
			rem=num%10;
			rev=rev *10+rem;
			num = num/10;
			
			rem=num%10;
			rev=rev *10+rem;
			num = num/10;
			
			rem=num%10;
			rev=rev *10+rem;
			System.out.println("Reverse order of num = "+rev);
		}
		else
		{
			System.out.println("Invalide input !");
		}
	}
}