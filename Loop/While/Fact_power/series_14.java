
// X!/x^1  + X!/x^3  + X!/x^5  =  1.0493827

import java.util.Scanner;
class Series_14
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
		
		while(i<=n)
		{	
			fact=1;
			pow=1;
			int j=1;
			while(j<=x )
			{
				fact*=j;
				pow*=n1;
				j++;
			}
			sum+=fact/pow;
			
			System.out.print(x+"!/"+n1+"^"+x);
			if(i<n)
				System.out.print(" + ");
			
			x+=2;
			i++;
		}
		System.out.print(" = "+sum);
	}
}


// X!/x^1  - X!/x^3  + X!/x^5 =   0.60493827

class Series_14_1
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
		
		while(i<=n)
		{	
			fact=1;
			pow=1;
			int j=1;
			while(j<=x)
			{
				fact*=j;
				pow*=n1;
				j++;
			}
			if(i%2==0)
			{
				sum-=fact/pow;
				System.out.print(" - "+x+"!/"+n1+"^"+x);
			}
			else
			{
				sum+=fact/pow;
				if(i>1)
				System.out.print(" + ");
				System.out.print(x+"!/"+n1+"^"+x);
			}
			x+=2;
			i++;
		}
		System.out.print(" = "+sum);
	}
}


//- X!/x^1  + X!/x^3  - X!/x^5  = -  0.60493827

class Series_14_2
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
		
		while(i<=n)
		{	
			fact=1;
			pow=1;
			int j=1;
			while(j<=x)
			{
				fact*=j;
				pow*=n1;
				j++;
			}
			if(i%2==0)
			{
				sum+=fact/pow;
				System.out.print(" + "+x+"!/"+n1+"^"+x);
			}
			else
			{
				sum-=fact/pow;
				
				System.out.print(" - "+x+"!/"+n1+"^"+x);
			}			
			x+=2;
			i++;
		}
		System.out.print(" = "+sum);
	}
}
