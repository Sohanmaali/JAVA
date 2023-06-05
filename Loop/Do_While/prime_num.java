//prime_num

import java.util.Scanner;
class Prime
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int n,i=2,count=0;
		System.out.println("Enter any number");
		n = sc.nextInt();
		int temp = n;
		do
		{
			if(n%i==0)
			{
				count++;
			}
			i++;
		}while(i<n);
		
		if(count==0)
		{
			System.out.println("Prime number");
		}
		else
		{
			{
			System.out.println("Not Prime number");
		}
		}
	}
}