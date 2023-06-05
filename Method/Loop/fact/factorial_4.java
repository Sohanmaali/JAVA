import java.util.Scanner; 

// 1 2/1! + 3/2! + 4/3! + 5/4! + 6/5! =   4.425
// 2 2/1! - 3/2! + 4/3! - 5/4! + 6/5!  = 1.0083334
// 3 -2/1! + 3/2! - 4/3! + 5/4! - 6/5! = - 1.0083334

class Series_4
{
	public void series1()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter turm");
		int n = sc.nextInt();
		float sum=0;
		int i=1;
		do
		{
			float fact=1;
			int j=1;
			do
			{
				fact*=j;
				j++;
			}while(j<=i);
			
			sum=sum+(i+1)/fact;
			
			if(i>1)
				System.out.print(" + ");
			
				System.out.print((i+1)+"/"+i+"!");
				i++;
		}while(i<=n);
		System.out.println(" = "+sum);
	}
	
	public void series2()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter turm");
		int n = sc.nextInt();
		float sum=0;
		int i=1;
		while(i<=n)
		{
			float fact=1;
			int j=1;
			while(j<=i)
			{
				fact*=j;
				j++;
			}
			
			if(i%2==0)
			{
				sum-=(i+1)/fact;
				System.out.print(" + "+(i+1)+"/"+i+"!");
			}
			else
			{
				sum+=(i+1)/fact;
				
				if(i>1)
				System.out.print(" + ");
			
				System.out.print((i+1)+"/"+i+"!");
			}
			i++;
		}
		System.out.println(" = "+sum);
	}
	public void series3()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter turm");
		int n = sc.nextInt();
		float sum=0;
		for(int i=1;i<=n;i++)
		{
			float fact=1;
			
			for(int j=1;j<=i;fact*=j,j++);

			if(i%2==0)
			{
				sum+=(i+1)/fact;
				System.out.print(" + "+(i+1)+"/"+i+"!");
			}
			else
			{
				sum-=(i+1)/fact;
				
				System.out.print(" - "+(i+1)+"/"+i+"!");
			}
			
		}
		System.out.println(" = "+sum);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Your choice are");
		System.out.println("\t1 For 2/1! + 3/2! + 4/3! + 5/4! + 6/5!\n\t2 For 2/1! - 3/2! + 4/3! - 5/4! + 6/5!\n\t3 For -2/1! + 3/2! - 4/3! + 5/4! - 6/5!");
		int choice = sc.nextInt();
		
		Series_4 ob = new Series_4();
		
		switch(choice)
		{
			case 1:
				ob.series1();
				break;
			
			case 2:
				ob.series2();
				break;
			
			case 3:
				ob.series3();
				break;
		}
	}
}