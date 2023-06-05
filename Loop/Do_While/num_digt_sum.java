//num_digt_sum


import java.util.Scanner;
class DigitSum
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int n,i=1,rem,sum=0;
		System.out.println("Enter any number");
		n = sc.nextInt();
		
		do
		{
		rem=n%10;
		sum+=rem;
		n/=10;		
		}while(n>0);
		System.out.println("Sum of Geven numer gidit = "+sum);	
	}
}