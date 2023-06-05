
// 2!/1  + 4!/2  + 6!/3  =  254.0

import java.util.Scanner;
class Series_17
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num of turm  ");
		int n = sc.nextInt();
		
		int i=1,x=2;
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
			sum += fact/i;
			System.out.print(x+"!/"+i);
			if(i<n)
				System.out.print(" + ");
			
			x+=2;
			i++;
		}
		System.out.print(" = "+sum);
	}
}


// 2!/1  - 4!/2  + 6!/3 = 230.0

class Series_17_1
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
		}
		System.out.print(" = "+sum);
	}
}


//- 2!/1  + 4!/2  - 6!/3  = -230.0

class Series_17_2
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
		}
		System.out.print(" = "+sum);
	}
}
 