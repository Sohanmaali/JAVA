
// 4/2!  + 6/4!  + 8/6!  =   2.261111

import java.util.Scanner;
class Series_31
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
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
			sum += (x+2)/fact;
			System.out.print((x+2)+"/"+x+"!");
			if(i<n)
				System.out.print(" + ");
			
			x+=2;
			i++;
		}while(i<=n);
		System.out.print(" = "+sum);
	}
}


// 4/2!  - 6/4!  + 8/6! =  1.7611111

class Series_31_1
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
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
				sum-=(x+2)/fact;
				System.out.print(" - "+(x+2)+"/"+x+"!");
			}
			else
			{
				sum+=(x+2)/fact;
				if(i>1)
				System.out.print(" + ");
				System.out.print((x+2)+"/"+x+"!");
			}
			x+=2;
			i++;
		}while(i<=n);
		System.out.print(" = "+sum);
	}
}


//- 4/2!  + 6/4!  - 8/6!  = - 1.7611111

class Series_31_2
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
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
				sum+=(x+2)/fact;
				System.out.print(" + "+(x+2)+"/"+x+"!");
			}
			else
			{
				sum-=(x+2)/fact;
				
				System.out.print(" - "+(x+2)+"/"+x+"!");
			}			
			x+=2;
			i++;
		}while(i<=n);
		System.out.print(" = "+sum);
	}
}
 