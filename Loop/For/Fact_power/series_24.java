
// 1/x^2  + 2/x^4  + 3/x^6  =  0.1399177

import java.util.Scanner;
class Series_24
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
			sum += i/pow;
			System.out.print(i+"/"+n1+"^"+x);
			if(i<n)
				System.out.print(" + ");
			
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}


// 1/x^2  - 2/x^4  + 3/x^6 =  0.09053498

class Series_24_1
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
				sum-=i/pow;
				System.out.print(" - "+i+"/"+n1+"^"+x);
			}
			else
			{
				sum+=i/pow;
				if(i>1)
				System.out.print(" + ");
				System.out.print(i+"/"+n1+"^"+x);
			}
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}


//- 1/x^2  + 2/x^4  - 3/x^6  = -  0.09053498

class Series_24_2
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
				sum+=i/pow;
				System.out.print(" + "+i+"/"+n1+"^"+x);
			}
			else
			{
				sum-=i/pow;
				
				System.out.print(" - "+i+"/"+n1+"^"+x);
			}			
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}
 