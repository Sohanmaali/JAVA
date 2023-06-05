
// 1/1!  + 3/3!  + 5/5!  = 1.54166

import java.util.Scanner;
class Series_6
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int n = sc.nextInt();
		int i=1,x=1;
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
			System.out.print(x+"/"+x+"!");
			if(i<n)
				System.out.print(" + ");
			sum+=x/fact;
			x+=2;
			i++;
		}while(i<=n);
		System.out.print(" = "+sum);
	}
}


// 1/1!  - 3/3!  + 5/5!  = 0.5416667

class Series_6_1
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int n = sc.nextInt();
		int i=1,x=1;
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
				sum-=x/fact;
				System.out.print(" - "+x+"/"+x+"!");
			}
			else
			{
				sum+=x/fact;
				if(i>1)
				System.out.print(" + ");
				System.out.print(x+"/"+x+"!");
			}
			x+=2;
			i++;
		}while(i<=n);
		System.out.print(" = "+sum);
	}
}


//- 1!/1  + 3!/3  - 5!/5  = -0.5416667

class Series_6_2
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int n = sc.nextInt();
		int i=1,x=1;
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
				sum+=x/fact;
				System.out.print(" + "+x+"/"+x+"!");
			}
			else
			{
				sum-=x/fact;
				
				System.out.print(" - "+x+"/"+x+"!");
			}			
			x+=2;
			i++;
		}while(i<=n);
		System.out.print(" = "+sum);
	}
}
