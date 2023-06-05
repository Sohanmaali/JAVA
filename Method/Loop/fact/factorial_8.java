import java.util.Scanner; 

// 1 1/1! + 3/2! + 5/3! + 7/4! + 9/5! =   3.7
// 2 1/1! - 3/2! + 5/3! - 7/4! + 9/5!  = 0.11666666
// 3 -1/1! + 3/2! - 5/3! + 7/4! - 9/5! = - 0.11666666

class Series_8
{
	public void series1()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter turm");
		int n = sc.nextInt();
		float sum=0;
		int i=1,k=1;
		do
		{
			int j=1;
			float fact = 1;
			do
			{
				fact*=j;
				j++;
			}while(j<=i);
			
			sum+=k/fact;
			if(i>1)
				System.out.print(" + ");
			System.out.print(k+"/"+i+"!");
			k+=2;
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
		int i=1,k=1;
		while(i<=n)
		{
			int j=1;
			float fact=1;
			while(j<=i)
			{
				fact*=j;
				j++;
			}
			if(i%2==0)
			{
				sum-=k/fact;
				System.out.print(" - "+k+"/"+i+"!");
			}
			else
			{
				sum+=k/fact;
				if(i>1)
					System.out.print(" + ");
				System.out.print(k+"/"+i+"!");
			}
			k+=2;
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
		int k=1;
		for(int i=1;i<=n;i++,k+=2)
		{
			float fact=1;
			for(int j=1;j<=i;fact*=j,j++);
			if(i%2==0)
			{
				sum+=k/fact;
				System.out.print(" + "+k+"/"+i+"!");
			}
			else
			{
				sum-=k/fact;
				System.out.print(" - "+k+"/"+i+"!");
			}
		}
		System.out.println(" = "+sum);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Your choice are");
		System.out.println("\t1 For 1/1! + 3/2! + 5/3! + 7/4! + 9/5!\n\t2 For 1/1! - 3/2! + 5/3! - 7/4! + 9/5!\n\t3 For -1/1! + 3/2! - 5/3! + 7/4! - 9/5!");
		int choice = sc.nextInt();
		
		Series_8 ob = new Series_8();
		
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