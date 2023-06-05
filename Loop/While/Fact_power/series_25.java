
// 2!/1  + 4!/3  + 6!/5  = 154.0

import java.util.Scanner;
class Series_25
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();

		int i=1,x=1;
		float fact=1,sum=0;
		
		while(i<=n)
		{	
			fact=1;
			int j=1;
			while(j<=x)
			{
				fact*=j+1;
				j++;
			}
			sum += fact/x;
			System.out.print((x+1)+"!/"+x);
			if(i<n)
				System.out.print(" + ");
			
			x+=2;
			i++;
		}
		System.out.print(" = "+sum);
	}
}


// 2!/1  - 4!/3  + 6!/5 =  138.0

class Series_25_1
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
	
		int i=1,x=1;
		float fact=1,sum=0;
		
		while(i<=n)
		{	
			fact=1;
			int j=1;
			while(j<=x)
			{
				fact*=j+1;
				j++;
			}
			if(i%2==0)
			{
				sum-=fact/x;
				System.out.print(" - "+(x+1)+"!/"+x);
			}
			else
			{
				sum+=fact/x;
				if(i>1)
				System.out.print(" + ");
				System.out.print((x+1)+"!/"+x);
			}
			x+=2;
			i++;
		}
		System.out.print(" = "+sum);
	}
}


//- 2!/1  + 4!/3  - 6!/5  = - 138.0

class Series_25_2
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();

		int i=1,x=1;
		float fact=1,sum=0;
		
		while(i<=n)
		{	
			fact=1;
			int j=1;
			while(j<=x)
			{
				fact*=j+1;
				j++;
			}
			if(i%2==0)
			{
				sum+=fact/x;
				System.out.print(" + "+(x+1)+"!/"+x);
			}
			else
			{
				sum-=fact/x;
				
				System.out.print(" - "+(x+1)+"!/"+x);
			}			
			x+=2;
			i++;
		}
		System.out.print(" = "+sum);
	}
}
 