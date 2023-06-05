
// 2/2!  + 4/4!  + 6/6!  =  1.175

import java.util.Scanner;
class Series_3
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int n = sc.nextInt();
		int i=1,x=2;
		float fact=1,sum=0;
		do
		{	
			fact=1;
			int j=1;
			do
			{
				fact*=j;
				j++;
			}while(j<=x);
			System.out.print(x+"/"+x+"!");
			if(i<n)
				System.out.print(" + ");
			sum+=x/fact;
			x+=2;
			i++;
		}while(i<=n);
		System.out.print(" = "+sum);
	}
}


// 2/2!  - 4/4!  + 6/6!  =  0.84166664

class Series_3_1
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int n = sc.nextInt();
		int i=1,x=2;
		float fact=1,sum=0;
		do
		{	
			fact=1;
			int j=1;
			do
			{
				fact*=j;
				j++;
			}while(j<=x);
			if(i%2==0)
			{
				sum-=x/fact;
				System.out.print(" - "+x+"/"+x+"!");
			}
			else
			{
				sum+=x/fact;
				if(i>1)
				System.out.print(" + ");
				System.out.print(x+"/"+x+"!");
			}
			x+=2;
			i++;
		}while(i<=n);
		System.out.print(" = "+sum);
	}
}


//- 2/2!  + 4/4!  - 6/6!  = - 0.84166664

class Series_3_2
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int n = sc.nextInt();
		int i=1,x=2;
		float fact=1,sum=0;
		do
		{	
			fact=1;
			int j=1;
			do
			{
				fact*=j;
				j++;
			}while(j<=x);
			if(i%2==0)
			{
				sum+=x/fact;
				System.out.print(" + "+x+"/"+x+"!");
			}
			else
			{
				sum-=x/fact;
				
				System.out.print(" - "+x+"/"+x+"!");
			}			
			x+=2;
			i++;
		}while(i<=n);
		System.out.print(" = "+sum);
	}
}
