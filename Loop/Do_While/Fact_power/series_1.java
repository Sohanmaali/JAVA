
// 2!  + 4!  + 6!  = 746

import java.util.Scanner;
class Series_1
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int n = sc.nextInt();
		int i=1,fact=1,x=2,sum=0;
		do
		{	
			fact=1;
			int j=1;
			do
			{
				fact*=j;
				j++;
			}while(j<=x);
			sum+=fact;
			
			System.out.print(x+"! ");
			if(i<n)
				System.out.print(" + ");
			
			x+=2;
			i++;
		}while(i<=n);
		System.out.print(" = "+sum);
	}
}


// 2!  - 4!  + 6!  = 698

class Series_1_1
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int n = sc.nextInt();
		int i=1,fact=1,x=2,sum=0;
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
				sum-=fact;
				System.out.print(" - "+x+"! ");
			}
			else
			{
				sum+=fact;
				if(i>1)
				System.out.print(" + ");
				System.out.print(x+"! ");
			}
			x+=2;
			i++;
		}while(i<=n);
		System.out.print(" = "+sum);
	}
}


//- 2!  + 4!  - 6!  = -698

class Series_1_2
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int n = sc.nextInt();
		int i=1,fact=1,x=2,sum=0;
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
				sum+=fact;
				System.out.print(" + "+x+"! ");
			}
			else
			{
				sum-=fact;
				
				System.out.print(" - "+x+"! ");
			}			
			x+=2;
			i++;
		}while(i<=n);
		System.out.print(" = "+sum);
	}
}
