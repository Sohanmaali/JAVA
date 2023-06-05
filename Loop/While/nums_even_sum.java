


//WAP that reads a set of integers, and then prints the sum of the even and odd integers


import java.util.Scanner;
class ESum
{
	public static void main(String[]args)                                  
	{
		int n,rem=0,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();
		
		while (n!=0)
		{
			rem = n%10;
			
			if(rem%2==0)
			{
				sum=sum+rem;
			}
			n/=10;
		}
		System.out.println("Sum of given nums even digit = "+sum);
	}
}

