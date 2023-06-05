
//input a positive integer. It should then output a message indicating whether the number is a prime number. 


import java.util.Scanner;
class Prime
{
	public static void main(String[]args)                                  
	{
		int n,count=0,i=1,j=2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();
		
		
		// First way of check prime
		/*while (i<=n)
		{
			if(n%i==0)
			{
				count++;
			}
			i++;
		}
		if(count==2)
		{
			System.out.println("Enter number is prime number.");
		}
		else
		{
			System.out.println("Enter number is Not prime number.");
		}*/
		
		// Second way of prime
		while (j<n)
		{
			if(n%j==0)
			{
				break;
			}
			j++;
		}
		if(j==n)
		{
			System.out.println("Enter number is prime number.");
		}
		else
		{
			System.out.println("Enter number is Not prime number.");
		}
	}
}