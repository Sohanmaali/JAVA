
// x^1/2!  + x^3/4!  + x^5/6!  =  2.9625

import java.util.Scanner;
class Series_15
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		
		System.out.println("Enter any powerof any num ");
		int n1 = sc.nextInt();
		
		int i,x=1;
		float pow=1,sum=0,fact=1;
		
		for(i=1;i<=n;i++)
		{	
			fact=1;
			pow=1;
			for(int j=1;j<=x;j++)
			{
				fact*=j+1;
				pow*=n1;
			}
			sum += pow/fact;
			System.out.print(n1+"^"+x+"/"+ (1+x));
			if(i<n)
				System.out.print(" + ");
			
			x+=2;
		
		}
		System.out.print(" = "+sum);
	}
}


// x^1/2!  - x^3/4!  + x^5/6! = 0.7125

class Series_15_1
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		
		System.out.println("Enter any powerof any num ");
		int n1 = sc.nextInt();
		
		int i,x=1;
		float pow=1,sum=0,fact;
		
		for(i=1;i<=n;i++)
		{	
			fact=1;
			pow=1;
			
			for(int j=1;j<=x;j++)
			{
				fact*=j+1;
				pow*=n1;
			}
			if(i%2==0)
			{
				sum-=pow/fact;
				System.out.print(" - "+n1+"^"+x+"/"+ (1+x));
			}
			else
			{
				sum+=pow/fact;
				if(i>1)
				System.out.print(" + ");
				System.out.print(n1+"^"+x+"/"+ (1+x));
			}
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}


//- x^1/2!  + x^3/4!  - x^5/6!  = -0.7125

class Series_15_2
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		
		System.out.println("Enter any powerof any num ");
		int n1 = sc.nextInt();
		
		int i,x=1;
		float pow=1,sum=0,fact;
		
		for(i=1;i<=n;i++)
		{	
			fact=1;
			pow=1;
			
			for(int j=1;j<=x;j++)
			{
				fact*=j+1;
				pow*=n1;
			}
			if(i%2==0)
			{
				sum+=pow/fact;
				System.out.print(" + "+n1+"^"+x+"/"+ (1+x));
			}
			else
			{
				sum-=pow/fact;
				
				System.out.print(" - "+n1+"^"+x+"/"+ (1+x));
			}			
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}
 