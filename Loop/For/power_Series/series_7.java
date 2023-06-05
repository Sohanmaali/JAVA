
//WAP to 1/x^1 + 2/x^2 + 3/x^3 + 4/x^4 + 5/x^5  =   1.78125

import java.util.Scanner;
class Series_7
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two num ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		float sum = 0,power= 1;
		for(int i = 1; i<=y; i++)
		{
			power *=x;
			sum+=i/power;
			if(i>1)
				System.out.print(" + ");
			System.out.print(i+"/"+x+"^"+i);
		}
		System.out.print(" = "+sum);
	}
}