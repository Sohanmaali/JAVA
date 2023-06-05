
// 2!/2  + 4!/4  + 6!/6  = 127.0

import java.util.Scanner;
class Series_2
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
			System.out.print(x+"!/"+x);
			if(i<n)
				System.out.print(" + ");
			sum+=fact/x;
			x+=2;
			i++;
		}while(i<=n);
		System.out.print(" = "+sum);
	}
}


// 2!/2  - 4!/4  + 6!/6  = 115.0

class Series_2_1
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
				sum-=fact/x;
				System.out.print(" - "+x+"!/"+x);
			}
			else
			{
				sum+=fact/x;
				if(i>1)
				System.out.print(" + ");
				System.out.print(x+"!/"+x);
			}
			x+=2;
			i++;
		}while(i<=n);
		System.out.print(" = "+sum);
	}
}


//- 2!/2  + 4!/4  - 6!/6  = -115.0

class Series_2_2
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
				sum+=fact/x;
				System.out.print(" + "+x+"!/"+x);
			}
			else
			{
				sum-=fact/x;
				
				System.out.print(" - "+x+"!/"+x);
			}			
			x+=2;
			i++;
		}while(i<=n);
		System.out.print(" = "+sum);
	}
}
