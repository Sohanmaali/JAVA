

//WAP to calculate power of given numbers.

import java.util.Scanner;
class Power
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int n1,n2,i=1;
		int pow=1;
		System.out.println("Enter any two number");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		while(i<=n2)
		{
			pow = pow*n1;
			i++;
		}
		System.out.println("Power  = "+pow);
	}
}