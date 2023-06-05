//palandrom_or_not


import java.util.Scanner;
class Palindrom
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int n,i=1,rem,rev=0;
		System.out.println("Enter any number");
		n = sc.nextInt();
		int temp = n;
		do
		{
		rem=n%10;
		rev=rev*10+rem;
		n/=10;		
		}while(n>0);
		//System.out.println(sum);
		
		if(temp==rev)
		{
			System.out.println("Palindrom num ");
		}
		else
		{
			System.out.println("Not Palindrom num ");
		}
	}
}