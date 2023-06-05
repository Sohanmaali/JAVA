import java.util.Scanner; 

class Check
{
	public void Palindrome()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any num");
		int  n = sc.nextInt();
		int rev=0,temp=n;
		for (;n>0;n/=10)
		{
			int rem = n%10;
			rev = rev*10+rem;
		}
		if(temp==rev)
		{
			System.out.println("Enter num is Palinrome");
		}
		else
		{
			System.out.println("Enter num is not Palinrome");
		}
	}
	public void armstrong()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any num");
		int  n = sc.nextInt();
		int count=0;
		int temp=n,sum=0;
		for(;n>0;n/=10)
		{
			count++;
		}
		n=temp;
		for(;n>0;n/=10)
		{
			int rem = n%10;
			int power = 1;
			for (int i=1;i<=count;i++)
			{
				power*=rem;
			}
			sum+=power;
		}
		if(sum==temp)
		{
			System.out.println("Enter num is Armstrong");
		}
		else
		{
			System.out.println("Enter num is not Armstrong");
		}
	}
	public void prime()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any num");
		int  n = sc.nextInt();
		boolean flage= true;
		for (int i = 2;i<n;i++)
		{
			if(n%i==0)
			{
				flage=false;
				break;
			}
		}
		if(flage)
		{
			System.out.println("Enter num is Prime");
		}
		else
		{
			System.out.println("Enter num is not Prime");
		}
	}
	public void perfect()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any num");
		int  n = sc.nextInt();
		int sum=0;
		for (int i = 1;i<n;i++)
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
		if(sum==n)
		{
			System.out.println("Enter num is perfect");
		}
		else
		{
			System.out.println("Enter num is not perfect");
		}
	}
	public void strong()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any num");
		int  n = sc.nextInt();
		int sum=0,temp=n;
		for (;n>0;n/=10)
		{
			int rem =n%10;
			int fact = 1;
			for(int j=1;j<=rem;j++)
				fact*=j;
			sum+=fact;
		}
		if(sum==temp)
		{
			System.out.println("Enter num is strong");
		}
		else
		{
			System.out.println("Enter num is not strong");
		}
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Your choice are");
		System.out.println("\t1 For check Palindrome num\n\t2 For check armstrong num\n\t3 For check prime num\n\t4 For check perfect num\n\t5 For check strong num ");
		int choice = sc.nextInt();
		
		Check ob = new Check();
		
		switch(choice)
		{
			case 1:
				ob.Palindrome();
				break;
			case 2:
				ob.armstrong();
				break;
			case 3:
				ob.prime();
				break;
			case 4:
				ob.perfect();
				break;
			case 5:
				ob.strong();
				break;
		}
	}
}
