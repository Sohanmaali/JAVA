
// x^2/1!  + x^4/3!  + x^6/5!  = 28.575

import java.util.Scanner;
class Series_36
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		
		System.out.println("Enter any powerof any num ");
		int n1 = sc.nextInt();
		
		int i,x=2,j,k=1;
		float pow=1,sum=0,fact;
		
		for(i=1;i<=n;i++)
		{	
			fact=1;
			pow=1;
			for(j=1;j<=x;j++)
			{
				pow*=n1;
			}
			for(j=1;j<=k;j++)
			{
				fact*=j;
			}
			sum += pow/fact;
			System.out.print(n1+"^"+x+"/"+k);
			if(i<n)
				System.out.print(" + ");
			
			x+=2;
			k+=2;
		}
		System.out.print(" = "+sum);
	}
}


//  x^2/1!  - x^4/3!  + x^6/5 =  1.5749998

class Series_36_1
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
	
		System.out.println("Enter any powerof any num ");
		int n1 = sc.nextInt();
		
		int i,x=2,k=1,j;
		float pow=1,sum=0,fact;
		
		for(i=1;i<=n;i++)
		{	
			pow=1;
			fact=1;
			for(j=1;j<=x;j++)
			{
				pow*=n1;
			}
			for(j=1;j<=k;j++)
			{
				fact*=j;
			}
			if(i%2==0)
			{
				sum-=pow/fact;
				System.out.print(" - "+n1+"^"+x+"/"+k);
			}
			else
			{
				sum+=pow/fact;
				if(i>1)
				System.out.print(" + ");
				System.out.print(n1+"^"+x+"/"+k);
			}
			x+=2;
			k+=2;
		}
		System.out.print(" = "+sum);
	}
}


//-  x^2/1!  + x^4/3!  - x^6/5  = -1.5749998

class Series_36_2
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		
		System.out.println("Enter any powerof any num ");
		int n1 = sc.nextInt();

		int i,x=2,j,k=1;
		float pow=1,sum=0,fact;
		
		for(i=1;i<=n;i++)
		{	
			pow=1;
			fact=1;
			for(j=1;j<=x;j++)
			{
				pow*=n1;
			}
			for(j=1;j<=k;j++)
			{
				fact*=j;
			}
			if(i%2==0)
			{
				sum+=pow/fact;
				System.out.print(" + "+n1+"^"+x+"/"+k);
			}
			else
			{
				sum-=pow/fact;
				
				System.out.print(" - "+n1+"^"+x+"/"+k);
			}			
			x+=2;
			k+=2;
		}
		System.out.print(" = "+sum);
	}
}
 