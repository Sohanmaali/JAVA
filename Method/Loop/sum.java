import java.util.Scanner; 

class Sum
{
	public void naturalSum()
	{
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter ending num");
		int num = sc.nextInt();
		
		for(int i =1;i<num;i++)
		{
			sum+=i;
		}
		System.out.println("Sum of "+num+" natural num "+sum);
	}
	public void evenOddSum()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num");
		int num = sc.nextInt();
		int even = 0,odd=0,count=0;
		for(int i =1;;i++)
		{
			even+=i*2;
			count++;
			if(count==num)
				break;
		}
		
		System.out.println("Sum of "+num+" even num "+even);
		count=0;
		for(int i = 1;;i++)
		{
			odd+=i*2-1;
			count++;
			if(count==num)
				break;
		}
		System.out.println("Sum of "+num+" odd num "+odd);
	}
	public void evenDigitSum()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any num");
		int num = sc.nextInt();
		int sum=0;
		for(;num>0;num/=10)
		{
			int rem = num%10;
			if(rem%2==0)
			{
				sum+=rem;
			}
		}
		System.out.println("Sum of num Even digit "+sum);
	}
	public void DigitSum()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any num");
		int num = sc.nextInt();
		int sum = 0;
		for(;num>0;num/=10)
		{
			int rem = num%10;
			sum+=rem;
		}
		System.out.println("Sum of num digit "+sum);
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Your choice are");
		System.out.println("\t1 For Netural num sum\n\t2 For n even odd sum \n\t3 For nums even digit sum \n\t4 For nums digit sum");
		int choice = sc.nextInt();
		
		Sum ob = new Sum();
		
		switch(choice)
		{
			case 1:
				ob.naturalSum();
				break;
			case 2:
				ob.evenOddSum();
				break;
			case 3:
				ob.evenDigitSum();
				break;
			case 4:
				ob.DigitSum();
				break;
		}
	}
}