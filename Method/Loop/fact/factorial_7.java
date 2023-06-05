import java.util.Scanner; 

// 1 1!/1 + 2!/3 + 3!/5 + 4!/7 + 5!/9 =  19.62857
// 2 1!/1 - 2!/3 + 3!/5 - 4!/7 + 5!/9  = 11.438095
// 3 -1!/1 + 2!/3! - 3!/5 + 4!/7 - 5!/9 = -11.438095

class Series_7
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
			float fact=1;
			int j=1;
			do
			{
				fact*=j;
				j++;
			}while(j<=i);
			
			sum=sum+(fact/k);
			
			if(i>1)
				System.out.print(" + ");
			
				System.out.print(i+"!/"+k);
				i++;
				k+=2;
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
			float fact=1;
			int j=1;
			while(j<=i)
			{
				fact*=j;
				j++;
			}
			
			if(i%2==0)
			{
				sum-=fact/k;
				System.out.print(" + "+i+"!/"+k);
			}
			else
			{
				sum+=fact/k;
				
				if(i>1)
				System.out.print(" + ");
			
				System.out.print(i+"!/"+k);
			}
			i++;
			k+=2;
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
		for(int i=1;i<=n;i++)
		{
			float fact=1;
			
			for(int j=1;j<=i;fact*=j,j++);

			if(i%2==0)
			{
				sum+=fact/k;
				System.out.print(" + "+i+"!/"+k);
			}
			else
			{
				sum-=fact/k;
				
				System.out.print(" - "+i+"!/"+k);
			}
			k+=2;
		}
		System.out.println(" = "+sum);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Your choice are");
		System.out.println("\t1 For 1!/1 + 2!/3 + 3!/5 + 4!/7 + 5!/9\n\t2 For 1!/1 - 2!/3 + 3!/5 - 4!/7 + 5!/9\n\t3 For -1!/1 + 2!/3! - 3!/5 + 4!/7 - 5!/9");
		int choice = sc.nextInt();
		
		Series_7 ob = new Series_7();
		
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