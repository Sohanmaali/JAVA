
// 2!/x^1 + 4!/x^3 + 6!/x^5  =  4.5185184

import java.util.Scanner;
class Series_35
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
			pow=1;
			fact=1;
			int j=1;
			while(j<=x)
			{
				pow*=n1;
				fact*=j+1;
				j++;
			}
			sum += fact/pow;
			System.out.print((x+1)+"!/"+n1+"^"+x);
			if(i<n)
				System.out.print(" + ");
			
			x+=2;
			i++;
		}
		System.out.print(" = "+sum);
	}
}


// 2!/x^1 - 4!/x^3 + 6!/x^5 =  2.7407408

class Series_35_1
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
			pow=1;
			fact=1;
			int j=1;
			while(j<=x)
			{
				pow*=n1;
				fact*=j+1;
				j++;
			}
			if(i%2==0)
			{
				sum-=fact/pow;
				System.out.print(" - "+(x+1)+"!/"+n1+"^"+x);
			}
			else
			{
				sum+=fact/pow;
				if(i>1)
				System.out.print(" + ");
				System.out.print(n1+"^"+(x+1)+"!/"+n1+"^"+x);
			}
			x+=2;
			i++;
		}
		System.out.print(" = "+sum);
	}
}


//- 2!/x^1 + 4!/x^3 - 6!/x^5  = - 2.7407408

class Series_35_2
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
			pow=1;
			fact=1;
			int j=1;
			while(j<=x)
			{
				pow*=n1;
				fact*=j+1;
				j++;
			}
			if(i%2==0)
			{
				sum+=fact/pow;
				System.out.print(" + "+(x+1)+"!/"+n1+"^"+x);
			}
			else
			{
				sum-=fact/pow;
				
				System.out.print(" - "+(x+1)+"!/"+n1+"^"+x);
			}			
			x+=2;
			i++;
		}
		System.out.print(" = "+sum);
	}
}
 