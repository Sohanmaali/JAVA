
// x^2/2  + x^4/4  + x^6/4  = 146.25

import java.util.Scanner;
class Series_8
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
			sum+=pow/x;
			
			System.out.print(n1+"^"+x+"/"+x);
			if(i<n)
				System.out.print(" + ");
			
			x+=2;
			i++;
		}
		System.out.print(" = "+sum);
	}
}


// x^2/2  - x^4/4  + x^6/4  = 105.75

class Series_8_1
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
				sum-=pow/x;
				System.out.print(" - "+x+"! ");
			}
			else
			{
				sum+=pow/x;
				if(i>1)
				System.out.print(" + ");
				System.out.print(x+"! ");
			}
			x+=2;
			i++;
		}
		System.out.print(" = "+sum);
	}
}


//- x^2/2  + x^4/4  - x^6/6  = -105.75

class Series_8_2
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
				sum+=pow/x;
				System.out.print(" + "+x+"/"+x);
			}
			else
			{
				sum-=pow/x;
				
				System.out.print(" - "+x+"/"+x);
			}			
			x+=2;
			i++;
		}
		System.out.print(" = "+sum);
	}
}
