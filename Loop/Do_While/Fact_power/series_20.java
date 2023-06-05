
// 1/1!  + 2/3!  + 3/5!  =  1.3583333

import java.util.Scanner;
class Series_20
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
			sum += i/fact;
			System.out.print(i+"/"+x+"!");
			if(i<n)
				System.out.print(" + ");
			
			x+=2;
			i++;
		}while(i<=n);
		System.out.print(" = "+sum);
	}
}


// 1!/1  - 3!/2  + 5!/3 = 40.666668

class Series_20_1
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		
		int i=1,x=1;
		float sum=0,fact=1;
		
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
		}
		System.out.print(" = "+sum);
	}
}


//- 1!/1  + 3!/2  - 5!/3  = - 40.666668

class Series_20_2
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();

		int i=1,x=1;
		float sum=0,fact=1;
		
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
				sum-=fact/i;
				
				System.out.print(" - "+i+"/"+x+"!");
			}			
			x+=2;
			i++;
		}
		System.out.print(" = "+sum);
	}
}
 