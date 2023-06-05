
// 2!/1  + 4!/3  + 6!/5  = 154.0

import java.util.Scanner;
class Series_25
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();

		int i,x=1;
		float fact=1,sum=0;
		
		for(i=1;i<=n;i++)
		{	
			fact=1;
			for(int j=1;j<=x;j++)
			{
				fact*=j+1;
			}
			sum += fact/x;
			System.out.print((x+1)+"!/"+x);
			if(i<n)
				System.out.print(" + ");
			
			x+=2;
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
	
		int i,x=1;
		float fact=1,sum=0;
		
		for(i=1;i<=n;i++)
		{	
			fact=1;
			
			for(int j=1;j<=x;j++)
			{
				
				fact*=j+1;
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

		int i,x=1;
		float fact=1,sum=0;
		
		for(i=1;i<=n;i++)
		{	
			fact=1;
			
			for(int j=1;j<=x;j++)
			{
				fact*=j+1;
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
		}
		System.out.print(" = "+sum);
	}
}
 