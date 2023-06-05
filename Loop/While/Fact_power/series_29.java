
// 1/x^2  + 3/x^4  + 5/x^6  =  0.15500686

import java.util.Scanner;
class Series_29
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num of turm  ");
		int n = sc.nextInt();
		
		System.out.println("Enter any num ");
		int n1 = sc.nextInt();
		
		int i=1,x=2;
		float pow=1,sum=0;
		
		while(i<=n)
		{	
			pow=1;
			int j=1;
			while(j<=x)
			{
				pow*=n1;
				j++;
			}
			sum += (i*2-1)/pow;
			System.out.print((i*2-1)+"/"+n1+"^"+x);
			if(i<n)
				System.out.print(" + ");
			
			x+=2;
			i++;
		}
		System.out.print(" = "+sum);
	}
}


// 1/x^2  - 3/x^4  + 5/x^6 =  0.08093279

class Series_29_1
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
	
		System.out.println("Enter any powerof any num ");
		int n1 = sc.nextInt();
		int i=1,x=2;
		float pow=1,sum=0;
		while(i<=n)
		{	
			pow=1;
			int j=1;
			while(j<=x)
			{
				pow*=n1;
				j++;
			}
			if(i%2==0)
			{
				sum-=(i*2-1)/pow;
				System.out.print(" - "+(i*2-1)+"/"+n1+"^"+x);
			}
			else
			{
				sum+=(i*2-1)/pow;
				if(i>1)
				System.out.print(" + ");
				System.out.print((i*2-1)+"/"+n1+"^"+x);
			}
			x+=2;
			i++;
		}
		System.out.print(" = "+sum);
	}
}


//- 1/x^2  + 3/x^4  - 5/x^6  = - 0.08093279

class Series_29_2
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		
		System.out.println("Enter any powerof any num ");
		int n1 = sc.nextInt();
		int i=1,x=2;
		float pow=1,sum=0;
		while(i<=n)
		{	
			pow=1;
			int j=1;
			while(j<=x)
			{
				pow*=n1;
				j++;
			}
			if(i%2==0)
			{
				sum+=(i*2-1)/pow;
				System.out.print(" + "+(i*2-1)+"/"+n1+"^"+x);
			}
			else
			{
				sum-=(i*2-1)/pow;
				
				System.out.print(" - "+(i*2-1)+"/"+n1+"^"+x);
			}			
			x+=2;
			i++;
		}
		System.out.print(" = "+sum);
	}
}
 