
// x^2/1  + x^4/3  + x^6/5  =  181.8

import java.util.Scanner;
class Series_28
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		
		System.out.println("Enter any powerof any num ");
		int n1 = sc.nextInt();
		
		int i,x=2;
		float pow=1,sum=0;
		
		for(i=1;i<=n;i++)
		{	
			pow=1;
			for(int j=1;j<=x;j++)
			{
				pow*=n1;
			}
			sum += pow/(i*2-1);
			System.out.print(n1+"^"+x+"/"+(i*2-1));
			if(i<n)
				System.out.print(" + ");
			
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}


// x^2/1  - x^4/3  + x^6/5 =  127.8

class Series_28_1
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
	
		System.out.println("Enter any powerof any num ");
		int n1 = sc.nextInt();
		
		int i,x=2;
		float pow=1,sum=0;
		
		for(i=1;i<=n;i++)
		{	
			pow=1;
			
			for(int j=1;j<=x;j++)
			{
				
				pow*=n1;
			}
			if(i%2==0)
			{
				sum-=pow/(i*2-1);
				System.out.print(" - "+n1+"^"+x+"/"+(i*2-1));
			}
			else
			{
				sum+=pow/(i*2-1);
				if(i>1)
				System.out.print(" + ");
				System.out.print(n1+"^"+x+"/"+(i*2-1));
			}
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}


//- x^2/1  + x^4/3  - x^6/5  = - 127.8

class Series_28_2
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		
		System.out.println("Enter any powerof any num ");
		int n1 = sc.nextInt();

		int i,x=2;
		float pow=1,sum=0;
		
		for(i=1;i<=n;i++)
		{	
			pow=1;
			
			for(int j=1;j<=x;j++)
			{
				pow*=n1;
			}
			if(i%2==0)
			{
				sum+=pow/(i*2-1);
				System.out.print(" + "+n1+"^"+x+"/"+(i*2-1));
			}
			else
			{
				sum-=pow/(i*2-1);
				
				System.out.print(" - "+n1+"^"+x+"/"+(i*2-1));
			}			
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}
 