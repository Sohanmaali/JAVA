
// x^1/1!  + x^3/3!  + x^5/5!  =   9.525

import java.util.Scanner;
class Series_13
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		
		System.out.println("Enter any powerof any num ");
		int n1 = sc.nextInt();
		
		int i=1,x=1;
		float pow=1,sum=0,fact;
		
		do
		{	
			fact=1;
			pow=1;
			int j=1;
			do
			{
				fact*=j;
				pow*=n1;
				j++;
			}while(j<=x);
			sum+=pow/fact;
			
			System.out.print(n1+"^"+x+"/"+x);
			if(i<n)
				System.out.print(" + ");
			
			x+=2;
			i++;
		}while(i<=n);
		System.out.print(" = "+sum);
	}
}


// x^1/1!  - x^3/3!  + x^5/5! =  0.5250001

class Series_13_1
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		
		System.out.println("Enter any powerof any num ");
		int n1 = sc.nextInt();
		
		int i=1,x=1;
		float pow=1,sum=0,fact;
		
		do
		{	
			fact=1;
			pow=1;
			int j=1;
			do
			{
				fact*=j;
				pow*=n1;
				j++;
			}while(j<=x);
			if(i%2==0)
			{
				sum-=pow/fact;
				System.out.print(" - "+n1+"^"+x+"/"+x);
			}
			else
			{
				sum+=pow/fact;
				if(i>1)
				System.out.print(" + ");
				System.out.print(n1+"^"+x+"/"+x);
			}
			x+=2;
			i++;
		}while(i<=n);
		System.out.print(" = "+sum);
	}
}


//- x^1/1!  + x^3/2!  - x^5/3!  = - 0.5250001

class Series_13_2
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		
		System.out.println("Enter any powerof any num ");
		int n1 = sc.nextInt();
		
		int i=1,x=1;
		float pow=1,sum=0,fact;
		
		do
		{	
			fact=1;
			pow=1;
			int j=1;
			do
			{
				fact*=j;
				pow*=n1;
				j++;
			}while(j<=x);
			if(i%2==0)
			{
				sum+=pow/fact;
				System.out.print(" + "+n1+"^"+x+"/"+x);
			}
			else
			{
				sum-=pow/fact;
				
				System.out.print(" - "+n1+"^"+x+"/"+x);
			}			
			x+=2;
			i++;
		}while(i<=n);
		System.out.print(" = "+sum);
	}
}
