//fectoriyal

import java.util.Scanner;
class Factorial
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int n,i=1,fact=1;
		System.out.println("Enter any number");
		n = sc.nextInt();
		do
		{
			fact*=i;
			i++;
		}while(i<=n);
		System.out.println("Factorial = "+fact);
	}
}