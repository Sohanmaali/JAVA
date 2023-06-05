
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
		
		int i=1,x=2,j,k=1;
		float pow=1,sum=0,fact;
		
		do
		{	
			fact=1;
			pow=1;
			j=1;
			do
			{
				pow*=n1;
				j++;
			}while(j<=x);
			j=1;
			do
			{
				fact*=j;
				j++;
			}while(j<=k);
			sum += pow/fact;
			System.out.print(n1+"^"+x+"/"+k);
			if(i<n)
				System.out.print(" + ");
			
			x+=2;
			k+=2;
			i++;
		}while(i<=n);
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
		
		int i=1,x=2,j,k=1;
		float pow=1,sum=0,fact;
		
		do
		{	
			fact=1;
			pow=1;
			j=1;
			do
			{
				pow*=n1;
				j++;
			}while(j<=x);
			j=1;
			do
			{
				fact*=j;
				j++;
			}while(j<=k);
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
			i++;
		}while(i<=n);
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

		int i=1,x=2,j,k=1;
		float pow=1,sum=0,fact;
		
		do
		{	
			fact=1;
			pow=1;
			j=1;
			do
			{
				pow*=n1;
				j++;
			}while(j<=x);
			j=1;
			do
			{
				fact*=j;
				j++;
			}while(j<=k);
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
			i++;
		}while(i<=n);
		System.out.print(" = "+sum);
	}
}
 