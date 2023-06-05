//Reverse


import java.util.Scanner;
class Reverse
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int n,i=1,rem,rev=0;
		System.out.println("Enter any number");
		n = sc.nextInt();
		
		do
		{
		rem=n%10;
		rev=rev*10+rem;
		n/=10;		
		}while(n>0);
		System.out.println("Reverse of Geven numer  = "+rev);	
	}
}