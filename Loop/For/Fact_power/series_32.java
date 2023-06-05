
// x^1/4  + x^3/6  + x^5/8  = 35.625

import java.util.Scanner;
class Series_32
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
			sum += pow/(i*2+2);
			System.out.print(n1+"^"+x+"/"+(i*2+2));
			if(i<n)
				System.out.print(" + ");
			
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}


// x^1/4  - x^3/6  + x^4/8 =  26.625

class Series_32_1
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
				sum-=pow/(i*2+2);
				System.out.print(" - "+n1+"^"+x+"/"+(i*2+2));
			}
			else
			{
				sum+=pow/(i*2+2);
				if(i>1)
				System.out.print(" + ");
				System.out.print(n1+"^"+x+"/"+(i*2+2));
			}
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}


//- x^1/4  + x^3/6  - x^5/8  = -  26.625

class Series_32_2
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
				sum+=pow/(i*2+2);
				System.out.print(" + "+n1+"^"+x+"/"+(i*2+2));
			}
			else
			{
				sum-=pow/(i*2+2);
				
				System.out.print(" - "+n1+"^"+x+"/"+(i*2+2));
			}			
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}
 