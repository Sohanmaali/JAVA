
// 1!  + 3!  + 5!  = 127

import java.util.Scanner;
class Series_4
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int n = sc.nextInt();
		int i,fact=1,x=1,sum=0;
		for(i=1;i<=n;i++)
		{	
			fact=1;
			for(int j=1;j<=x;j++)
			{
				fact*=j;
			}
			System.out.print(x+"! ");
			if(i<n)
				System.out.print(" + ");
			sum+=fact;
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}


// 1!  - 3!  + 5!  = 115

class Series_4_1
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int n = sc.nextInt();
		int i,fact=1,x=1,sum=0;
		for(i=1;i<=n;i++)
		{	
			fact=1;
			for(int j=1;j<=x;j++)
			{
				fact*=j;
				
			}
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
		}
		System.out.print(" = "+sum);
	}
}


//- 1!  + 3!  - 5!  = -115

class Series_4_2
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int n = sc.nextInt();
		int i,fact=1,x=1,sum=0;
		for(i=1;i<=n;i++)
		{	
			fact=1;
			for(int j=1;j<=x;j++)
			{
				fact*=j;
			}
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
		}
		System.out.print(" = "+sum);
	}
}
