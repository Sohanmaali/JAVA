

//swap two num without using third vareable and arethmeticla operator

import java.util.Scanner;
class SwapNum
{
	public static void main(String[]args)                                  
	{
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two number");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Before swaping\nA = "+a+"\nB = "+b);
		
		//bitwise operator
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After swaping\nA = "+a+"\nB = "+b);
	}
}