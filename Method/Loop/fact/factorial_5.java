import java.util.Scanner; 

// 1 1!/2 + 2!/4 + 3!/6 + 4!/8 + 5!/10 =  17
// 2 1!/2 - 2!/4 + 3!/6 - 4!/8 + 5!/10  =  10
// 3 -1!/2 + 2!/4 - 3!/6 + 4!/8 - 5!/10 =  -10

class Series_5
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
			
			sum=sum+fact/(i*2);
			
			if(i>1)
				System.out.print(" + ");
			
				System.out.print(i+"!/"+(i*2));
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
				sum-=fact/(i*2);
				System.out.print(" + "+i+"!/"+(i*2));
			}
			else
			{
				sum+=fact/(i*2);
				
				if(i>1)
				System.out.print(" + ");
			
				System.out.print(i+"!/"+(i*2));
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
				sum+=fact/(i*2);
				System.out.print(" + "+i+"!/"+(i*2));
			}
			else
			{
				sum-=fact/(i*2);
				
				System.out.print(" - "+i+"!/"+(i*2));
			}
			
		}
		System.out.println(" = "+sum);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Your choice are");
		System.out.println("\t1 For 1!/2 + 2!/4 + 3!/6 + 4!/8 + 5!/10\n\t2 For 1!/2 - 2!/4 + 3!/6 - 4!/8 + 5!/10\n\t3 For -1!/2 + 2!/4 - 3!/6 + 4!/8 - 5!/10");
		int choice = sc.nextInt();
		
		Series_5 ob = new Series_5();
		
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