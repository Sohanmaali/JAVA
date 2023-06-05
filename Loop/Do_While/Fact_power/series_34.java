
// x^1/2! + x^3/4! + x^5/6!  =  2.9625

import java.util.Scanner;
class Series_34
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num of turm  ");
		int n = sc.nextInt();
		
		System.out.println("Enter any num ");
		int n1 = sc.nextInt();
		
		int i=1,x=1;
		float pow=1,sum=0,fact;
		
		do
		{	
			pow=1;
			fact=1;
			int j=1;
			do
			{
				pow*=n1;
				fact*=j+1;
				j++;
			}while(j<=x);
			sum += pow/fact;
			System.out.print(n1+"^"+x+"/"+(x+1));
			if(i<n)
				System.out.print(" + ");
			
			x+=2;
			i++;
		}while(i<=n);
		System.out.print(" = "+sum);
	}
}


// x^1/2! - x^3/4! + x^5/6! =  0.7125

class Series_34_1
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num of turm  ");
		int n = sc.nextInt();
		
		System.out.println("Enter any num ");
		int n1 = sc.nextInt();
		
		int i=1,x=1;
		float pow=1,sum=0,fact;
		
		do
		{	
			pow=1;
			fact=1;
			int j=1;
			do
			{
				pow*=n1;
				fact*=j+1;
				j++;
			}while(j<=x);
			if(i%2==0)
			{
				sum-=pow/fact;
				System.out.print(" - "+n1+"^"+x+"/"+(x+1));
			}
			else
			{
				sum+=pow/fact;
				if(i>1)
				System.out.print(" + ");
				System.out.print(n1+"^"+x+"/"+(x+1));
			}
			x+=2;
			i++;
		}while(i<=n);
		System.out.print(" = "+sum);
	}
}


//- x^1/2! + x^3/4! - x^5/6!  = - 0.7125

class Series_34_2
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num of turm  ");
		int n = sc.nextInt();
		
		System.out.println("Enter any num ");
		int n1 = sc.nextInt();
		
		int i=1,x=1;
		float pow=1,sum=0,fact;
		
		do
		{	
			pow=1;
			fact=1;
			int j=1;
			do
			{
				pow*=n1;
				fact*=j+1;
				j++;
			}while(j<=x);
			if(i%2==0)
			{
				sum+=pow/fact;
				System.out.print(" + "+n1+"^"+x+"/"+(x+1));
			}
			else
			{
				sum-=pow/fact;
				
				System.out.print(" - "+n1+"^"+x+"/"+(x+1));
			}			
			x+=2;
			i++;
		}while(i<=n);
		System.out.print(" = "+sum);
	}
}
 