
// 1!/x^2  + 3!/x^4  + 5!/x^6  = 0.34979427

import java.util.Scanner;
class Series_37
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num of turm  ");
		int n = sc.nextInt();
		
		System.out.println("Enter any num ");
		int n1 = sc.nextInt();
		
		int i=1,x=2,j,k=1;
		float pow=1,sum=0,fact;
		
		while(i<=n)
		{	
			fact=1;
			pow=1;
			j=1;
			while(j<=x)
			{
				pow*=n1;
				j++;
			}
			j=1;
			while(j<=k)
			{
				fact*=j;
				j++;
			}
			sum += fact/pow;
			System.out.print(k+"/"+n1+"^"+x);
			if(i<n)
				System.out.print(" + ");
			
			x+=2;
			k+=2;
			i++;
		}
		System.out.print(" = "+sum);
	}
}


//  1!/x^2  + 3!/x^4  + 5!/x^6 =  0.20164609

class Series_37_1
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
		
		while(i<=n)
		{	
			fact=1;
			pow=1;
			j=1;
			while(j<=x)
			{
				pow*=n1;
				j++;
			}
			j=1;
			while(j<=k)
			{
				fact*=j;
				j++;
			}
			if(i%2==0)
			{
				sum-=fact/pow;
				System.out.print(" - "+k+"/"+n1+"^"+x);
			}
			else
			{
				sum+=fact/pow;
				if(i>1)
				System.out.print(" + ");
				System.out.print(k+"/"+n1+"^"+x);
			}
			x+=2;
			k+=2;
			i++;
		}
		System.out.print(" = "+sum);
	}
}


//-  1!/x^2  + 3!/x^4  + 5!/x^6  = -0.20164609

class Series_37_2
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
		
		while(i<=n)
		{	
			fact=1;
			pow=1;
			j=1;
			while(j<=x)
			{
				pow*=n1;
				j++;
			}
			j=1;
			while(j<=k)
			{
				fact*=j;
				j++;
			}
			if(i%2==0)
			{
				sum+=fact/pow;
				System.out.print(" + "+k+"/"+n1+"^"+x);
			}
			else
			{
				sum-=fact/pow;
				
				System.out.print(" - "+k+"/"+n1+"^"+x);
			}			
			x+=2;
			k+=2;
			i++;
		}
		System.out.print(" = "+sum);
	}
}
 
 