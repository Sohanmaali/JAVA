// Prime

import java.util.Scanner;
import java.lang.Math;
class DataClass
{
	int n,c;
	
	public void Prime(int n)
	{
		if(n>1)
		{
			if(this.n%n==0)
			{
				c++;
				break;
			}
			this.Prime(n-1)
		}
	}
}
class Prime
{
	public void prime1()
	{
		DataClass ob1 = new DataClass();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any num");
		ob1.n = sc.nextInt();
		ob1.armstrong(ob1.n/2);
		if(ob1.c == 0)
		{
			System.out.println("Enter Number is Prime");
		}
		else
		{
			System.out.println("Enter Number is Not Prime");
		}
	}
	public static void main(String[]args)
	{
		Prime ob = new Prime();
		ob.prime1();
	}
}		
