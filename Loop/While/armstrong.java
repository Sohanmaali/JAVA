
// Armstrong or not

import java.util.Scanner;
class Armstrong
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int n,rem,sum=0;
		System.out.println("Enter any number");
		n = sc.nextInt();
		int temp = n,count=0;
		while(n>0)
		{
			count++;
			n/=10;
		}
		//System.out.println(count);
		n = temp;
		while(n>0)
		{
			rem= n%10;
			int i=1,pow=1;
			while(i<=count)
			{
				pow*=rem;
				
				i++;
				//System.out.println(pow);
			}
			sum+=pow;
			n/=10;
		}
		//System.out.println(sum);
		if(sum==temp)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not Armstrong Number");
		}
	}
}