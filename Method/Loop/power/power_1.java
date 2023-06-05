import java.util.Scanner; 

// 1 x^1 + x^2 + x^3 + x^4 + x^5
// 2 x^1 - x^2 + x^3 - x^4 + x^5
// 3 - x^1 + x^2 - x^3 + x^4 - x^5

class Power_1
{
	public void power1()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int n = sc.nextInt();
		
		System.out.println("Enter turm");
		int m = sc.nextInt();
		
		int sum=0;
		int i=1, power = 1,j=1;
		do
		{
		
			power*=n;
			sum+=power;
			
			if(i>1)	
				System.out.print(" + ");
			System.out.print(n+"^"+i);
			i++;
		}while(i<=m);
		
		System.out.println(" = "+sum);
	}
	public void power2()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter turm");
		int n = sc.nextInt();
		
		System.out.println("Enter turm");
		int m = sc.nextInt();
		
		int sum=0;
		int i=1,power;
		while(i<=n)
		{
			power*=n;			
			if(i%2==0)
			{
				sum-=power;
				System.out.print(" - "+n+"^"+i);
			}
			else
			{
				sum+=power;
				if(i>1)
					System.out.print(" + ");
				System.out.print(n+"^"+i);
			}
			i++;
		}
		System.out.println(" = "+sum);
	}
	public void power3()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter turm");
		int n = sc.nextInt();
		
		System.out.println("Enter turm");
		int m = sc.nextInt();
		
		int sum=0,power = 1;
		for(int i=1;i<=m;i++)
		{
			
			power*=n
			if(i%2==0)
			{
				sum+=power;
				System.out.print(" + "+n+"^"+i);
			}
			else
			{
				sum-=power;
				System.out.print(" - "+n+"^"+i);
			}
		}
		System.out.println(" = "+sum);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Your choice are");
		System.out.println("\t1 For x^1 + x^2 + x^3 + x^4 + x^5\n\t2 For x^1 - x^2 + x^3 - x^4 + x^5\n\t3 For - x^1 + x^2 - x^3 + x^4 - x^5");
		int choice = sc.nextInt();
		
		Power_1 ob = new Power_1();
		
		switch(choice)
		{
			case 1:
				ob.power1();
				break;
			
			case 2:
				ob.power2();
				break;
			
			case 3:
				ob.power3();
				break;
		}
	}
}