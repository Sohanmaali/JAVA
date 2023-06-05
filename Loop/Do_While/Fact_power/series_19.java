
// 1!/1  + 3!/2  + 5!/3  =  44.0

import java.util.Scanner;
class Series_19
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		
		int i=1,x=1;
		float sum=0,fact=1;
		
		do
		{	
			fact=1;
			int j=1;
			do
			{
				fact*=j;
				j++;
			}while(j<=x);
			sum += fact/i;
			System.out.print(x+"!/"+i);
			if(i<n)
				System.out.print(" + ");
			
			x+=2;
			i++;
		}while(i<=n);
		System.out.print(" = "+sum);
	}
}


// 1!/1  - 3!/2  + 5!/3 = 38.0

class Series_19_1
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		
		int i=1,x=1;
		float sum=0,fact=1;
		
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
				sum-=fact/i;
				System.out.print(" - "+x+"!/"+i);
			}
			else
			{
				sum+=fact/i;
				if(i>1)
				System.out.print(" + ");
				System.out.print(x+"!/"+i);
			}
			x+=2;
			i++;
		}while(i<=n);
		System.out.print(" = "+sum);
	}
}


//- 1!/1  + 3!/2  - 5!/3  = -38.0

class Series_19_2
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();

		int i=1,x=1;
		float sum=0,fact=1;
		
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
				sum+=fact/i;
				System.out.print(" + "+x+"!/"+i);
			}
			else
			{
				sum-=fact/i;
				
				System.out.print(" - "+x+"!/"+i);
			}			
			x+=2;
			i++;
		}while(i<=n);
		System.out.print(" = "+sum);
	}
}
 