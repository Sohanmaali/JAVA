import java.util.Scanner; 

class FiboFact
{
	public void fibonacci()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Fibonacci serice turm");
		int n = sc.nextInt();
		
		int a=-1,b=1,sum=0;
		for(int i=1;i<n;i++)
		{
			sum = a+b;
			System.out.print(sum +" ");
			a=b;
			b=sum;
		}
	}
	public void factorial()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Your any num");
		int n = sc.nextInt();
		int fact=1;
		for(int i=1;i<=n;fact*=i,i++);
		System.out.println("Factorial of "+n+" = "+fact);
	}
	public void reverse()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Your any num");
		int n = sc.nextInt();
		int rev=0;
		for(;n>0;n/=10)
		{
			int rem = n%10;
			rev=rev*10+rem;
		}
		System.out.println("Reverse of num "+rev);
	}
	public void Table()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Your any num");
		int n = sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			int tab = n*i;
			System.out.println(n+" * "+i+" = "+tab);
		}
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Your choice are");
		System.out.println("\t1 For Fibonacci\n\t2 For factorial of any num\n\t3 For reverse of any num\n\t4 For Table of any num");
		int choice = sc.nextInt();
		
		FiboFact ob = new FiboFact();
		
		switch(choice)
		{
			case 1:
				ob.fibonacci();
				break;
			case 2:
				ob.factorial();
				break;
			case 3:
				ob.reverse();
				break;
			case 4:
				ob.Table();
				break;
		}
	}
}