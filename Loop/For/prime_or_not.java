//Prime or not

import java.util.Scanner;
class Prime
{
  public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any  num");
		int n = sc.nextInt();
		
		//first Way
		
		//int count=0,i;
		/*for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not Prime number");
		}
		*/
		
		//Second Way
		
		/*
		int count=0,i;
		for(i=2;i<n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not Prime number");
		}
		
		*/
		
		//Third Way
		
		/* int i;
		for(i=1;i<n;i++)
		{
			if(n%i==0)
			{
				break;
			}
		}
		if(i==n)
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not Prime number");
		} */
		
		// Fourth Way
		/* boolean flage  = false;
		for(int i = 2;i<n/2;i++)
		{
			if(n%i==0)
			{
				flage=true;
			}
		}
		if(!flage && n > 1)
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not Prime number");
		} */
		
		
		int count =0;
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				System.out.println("not prime");
				count++;
				break;
			}
		}
		if(count == 0&& n>1)
		{
			System.out.println("prime num prime");
		}
	}
}		
