
// 1/2!  + 3/4!  + 5/6!  =  0.6319444

import java.util.Scanner;
class Series_26
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
			sum += x/fact;
			System.out.print(x+"/"+(x+1)+"!");
			if(i<n)
				System.out.print(" + ");
			
			x+=2;
			i++;
		}
		System.out.print(" = "+sum);
	}
}


// 1/2!  - 3/4!  + 5/6! =  0.38194445

class Series_26_1
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
				sum-=x/fact;
				System.out.print(" - "+x+"/"+(x+1)+"!");
			}
			else
			{
				sum+=x/fact;
				if(i>1)
				System.out.print(" + ");
				System.out.print(x+"/"+(x+1)+"!");
			}
			x+=2;
			i++;
		}
		System.out.print(" = "+sum);
	}
}


//- 1/2!  + 3/4!  - 5/6!  = - 0.38194445

class Series_26_2
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
				sum+=x/fact;
				System.out.print(" + "+x+"/"+(x+1)+"!");
			}
			else
			{
				sum-=x/fact;
				
				System.out.print(" - "+x+"/"+(x+1)+"!");
			}			
			x+=2;
			i++;
		}
		System.out.print(" = "+sum);
	}
}
 