
// 1/x^1  + 3/x^3  + 5/x^5  =  0.46502057

import java.util.Scanner;
class Series_12
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		
		System.out.println("Enter any powerof any num ");
		int n1 = sc.nextInt();
		
		int i,x=1;
		float pow=1,sum=0;
		
		for(i=1;i<=n;i++)
		{	
			pow=1;
			for(int j=1;j<=x;j++)
			{
				pow*=n1;
			}
			sum+=x/pow;
			System.out.print(x+"/"+x+"^"+x);
			if(i<n)
				System.out.print(" + ");
			
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}


// x^1/1 - x^3/3  + x^5/5  =  0.24279837

class Series_12_1
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		
		System.out.println("Enter any powerof any num ");
		int n1 = sc.nextInt();
		
		int i,x=1;
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
				sum-=x/pow;
				System.out.print(" - "+x+"/"+x+"^"+x);
			}
			else
			{
				sum+=x/pow;
				if(i>1)
				System.out.print(" + ");
				System.out.print(n1+"^"+x+"/"+x+"^"+x);
			}
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}


//- x^1  + x^3  - x^5  = -0.24279837

class Series_12_2
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		
		System.out.println("Enter any powerof any num ");
		int n1 = sc.nextInt();
		
		int i,x=1;
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
				sum+=x/pow;
				System.out.print(" + "+x+"/"+x+"^"+x);
			}
			else
			{
				sum-=x/pow;
				
				System.out.print(" - "+x+"/"+x+"^"+x);
			}			
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}
