
// x^2/1  + x^4/2  + x^6/3  = 292.5

import java.util.Scanner;
class Series_23
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
			sum += pow/i;
			System.out.print(n1+"^"+x+"/"+i);
			if(i<n)
				System.out.print(" + ");
			
			x+=2;
			i++;
		
		}
		System.out.print(" = "+sum);
	}
}


// x^2/1  - x^4/2  + x^6/3 = 211.5

class Series_23_1
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
				sum-=pow/i;
				System.out.print(" - "+n1+"^"+x+"/"+i);
			}
			else
			{
				sum+=pow/i;
				if(i>1)
				System.out.print(" + ");
				System.out.print(n1+"^"+x+"!");
			}
			x+=2;
			i++;
		}
		System.out.print(" = "+sum);
	}
}


//- x^2/1  + x^4/2  - x^6/3  = -211.5

class Series_23_2
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
				sum+=pow/i;
				System.out.print(" + "+n1+"^"+x+"/"+i);
			}
			else
			{
				sum-=pow/i;
				
				System.out.print(" - "+n1+"^"+x+"/"+i);
			}			
			x+=2;
			i++;
		}
		System.out.print(" = "+sum);
	}
}
 