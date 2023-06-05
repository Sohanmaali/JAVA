
// 1/2!  + 2/4!  + 3/6!  =  0.5875

import java.util.Scanner;
class Series_18
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		
		int i=1,x=2;
		float sum=0,fact;
		
		while(i<=n)
		{	
			fact=1;
			int j=1;
			while(j<=x)
			{
				fact*=j;
				j++;
				
			}
			sum += i/fact;
			System.out.print(i+"/"+x+"!");
			if(i<n)
				System.out.print(" + ");
			
			x+=2;
			i++;
		}
		System.out.print(" = "+sum);
	}
}


// 1/2!  - 2/4!  + 3/6! = 0.42083333

class Series_18_1
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		
		int i=1,x=2;
		float sum=0,fact;
		
		while(i<=n)
		{	
			fact=1;
			int j=1;
			while(j<=x)
			{
				fact*=j;
				j++;
			}
			if(i%2==0)
			{
				sum-=i/fact;
				System.out.print(" - "+i+"/"+x+"!");
			}
			else
			{
				sum+=i/fact;
				if(i>1)
				System.out.print(" + ");
				System.out.print(i+"/"+x+"!");
			}
			x+=2;
			i++;
		}
		System.out.print(" = "+sum);
	}
}


//- 1/2!  + 2/4!  - 3/6!  = -0.42083333

class Series_18_2
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();

		int i=1,x=1;
		float sum=0,fact;
		
		while(i<=n)
		{	
			fact=1;
			int j=1;
			while(j<=x)
			{
				fact*=j;
				j++;
				
			}
			if(i%2==0)
			{
				sum+=i/fact;
				System.out.print(" + "+i+"/"+x+"!");
			}
			else
			{
				sum-=i/fact;
				
				System.out.print(" - "+i+"/"+x+"!");
			}			
			x+=2;
			i++;
		}
		System.out.print(" = "+sum);
	}
}
 