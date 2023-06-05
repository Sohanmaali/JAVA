
// x^2/4  + x^4/6  + x^6/8  =   106.875

import java.util.Scanner;
class Series_30
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
			sum += pow/(x+2);
			System.out.print(n1+"^"+x+"/"+(x+2));
			if(i<n)
				System.out.print(" + ");
			
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}


// x^2/4  - x^4/6  + x^6/8 =  79.875

class Series_30_1
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
				sum-=pow/(x+2);
				System.out.print(" - "+n1+"^"+x+"/"+(x+2));
			}
			else
			{
				sum+=pow/(x+2);
				if(i>1)
				System.out.print(" + ");
				System.out.print(n1+"^"+x+"/"+(x+2));
			}
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}


//- x^2/4  + x^4/6  - x^6/8  = - 79.875

class Series_30_2
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
				sum+=pow/(x+2);
				System.out.print(" + "+n1+"^"+x+"/"+(x+2));
			}
			else
			{
				sum-=pow/(x+2);
				
				System.out.print(" - "+n1+"^"+x+"/"+(x+2));
			}			
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}
 