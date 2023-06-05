
// 4/x^1  + 6/x^3  + 8/x^5  = 1.5884774

import java.util.Scanner;
class Series_33
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num of turm  ");
		int n = sc.nextInt();
		
		System.out.println("Enter any num ");
		int n1 = sc.nextInt();
		
		int i=1,x=1;
		float pow=1,sum=0;
		
		do
		{	
			pow=1;
			int j=1;
			do
			{
				pow*=n1;
				j++;
			}while(j<=x);
			sum += (i*2+2)/pow;
			System.out.print((i*2+2)+"/"+n1+"^"+x);
			if(i<n)
				System.out.print(" + ");
			
			x+=2;
			i++;
		}while(i<=n);
		System.out.print(" = "+sum);
	}
}


// 4/x^1  - 6/x^3  + 8/x^5 =  1.144033

class Series_33_1
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num of turm  ");
		int n = sc.nextInt();
		
		System.out.println("Enter any num ");
		int n1 = sc.nextInt();
		
		int i=1,x=1;
		float pow=1,sum=0;
		
		do
		{	
			pow=1;
			int j=1;
			do
			{
				pow*=n1;
				j++;
			}while(j<=x);
			if(i%2==0)
			{
				sum-=(i*2+2)/pow;
				System.out.print(" - "+(i*2+2)+"/"+n1+"^"+x);
			}
			else
			{
				sum+=(i*2+2)/pow;
				if(i>1)
				System.out.print(" + ");
				System.out.print((i*2+2)+"/"+n1+"^"+x);
			}
			x+=2;
			i++;
		}while(i<=n);
		System.out.print(" = "+sum);
	}
}


//- 4/x^1  + 6/x^3  - 8/x^5  = - 1.144033

class Series_33_2
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num of turm  ");
		int n = sc.nextInt();
		
		System.out.println("Enter any num ");
		int n1 = sc.nextInt();

		int i=1,x=1;
		float pow=1,sum=0;
		
		do
		{	
			pow=1;
			int j=1;
			do
			{
				pow*=n1;
				j++;
			}while(j<=x);
			if(i%2==0)
			{
				sum+=(i*2+2)/pow;
				System.out.print(" + "+(i*2+2)+"/"+n1+"^"+x);
			}
			else
			{
				sum-=(i*2+2)/pow;
				
				System.out.print(" - "+(i*2+2)+"/"+n1+"^"+x);
			}			
			x+=2;
			i++;
		}while(i<=n);
		System.out.print(" = "+sum);
	}
}
 