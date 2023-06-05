import java.util.Scanner; 

class NtoN
{
	public void palindromeNum()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter starting and ending num");
		int  n = sc.nextInt();
		int  m = sc.nextInt();
		
		for(;n<=m;n++)
		{
			int temp = n,rev=0;
			for (;temp>0;temp/=10)
			{
				int rem = temp%10;
				rev = rev*10+rem;
			}
			if(n==rev)
			{
				System.out.print(rev+" ");
			}	
		}
	}
	public void armstrongNum()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter starting and ending num");
		int  n = sc.nextInt();
		int  m = sc.nextInt();
		
		for(;n<=m;n++)
		{
			int temp=n,sum=0;
			int count=0;
			for(;temp>0;temp/=10)
			{
				count++;
			}
			temp=n;
			for(;temp>0;temp/=10)
			{
				int rem = temp%10;
				int power = 1;
				for (int i=1;i<=count;i++)
				{
					power*=rem;
				}
				sum+=power;
			}
			if(sum==n)
			{
				System.out.print(sum+" ");
			}
		}
	}
	public void primeNum()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter starting and ending num");
		int  n = sc.nextInt();
		int  m = sc.nextInt();
		for(;n<=m;n++)
		{
			int count=0;
			for (int i = 2;i<n;i++)
			{
				if(n%i==0)
				{
					count++;
				}
			}
			if(count==0&&n>1)
			{
				System.out.print(n+" ");
			}
		}
	}
	public void perfectNum()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter starting and ending num");
		int  n = sc.nextInt();
		int  m = sc.nextInt();
		for(;n<=m;n++)
		{
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
				System.out.print(n+" ");
			}	
		}
	}
	public void strongNum()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter starting and ending num");
		int  n = sc.nextInt();
		int  m = sc.nextInt();
		
		for(;n<=m;n++)
		{
			int sum=0,temp=n;
			for (;temp>0;temp/=10)
			{
				int rem =temp%10;
				int fact = 1;
				
				for(int j=1;j<=rem;j++)
				fact*=j;
			
				sum+=fact;
			}
			if(sum==n)
			{
				System.out.println(sum+" ");
			}
		}
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Your choice are");
		System.out.println("\t1 For print n to n Palindrome num\n\t2 For print n to n armstrong num\n\t3 For print n to n prime num\n\t4 For print n to n perfect num\n\t5 For print n to n strong num ");
		int choice = sc.nextInt();
		
		NtoN ob = new NtoN();
		
		switch(choice)
		{
			case 1:
				ob.palindromeNum();
				break;
			case 2:
				ob.armstrongNum();
				break;
			case 3:
				ob.primeNum();
				break;
			case 4:
				ob.perfectNum();
				break;
			case 5:
				ob.strongNum();
				break;
		}
	}
}
