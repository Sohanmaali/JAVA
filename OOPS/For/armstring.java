// Armstrong

import java.util.Scanner;
import java.lang.Math;
class DataClass
{
	int a,rem,n,sum,c;
	
	public int armstrong()
	{
		count(this.n);
		for(;this.n>0;this.n/=10)
		{
			this.sum+=Math.pow(this.rem(this.n),this.c);
		}
		return sum;
	}
	public int count(int n)
	{
		for(;n>0;n/=10)
		this.c++;
		return this.c;
	}	
	public int rem(int n)
	{
		return n%10;
	}
}
class Armstrong
{
	public void arm()
	{
		DataClass ob1 = new DataClass();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any num");
		ob1.n = sc.nextInt();
		int temp = ob1.n;
		ob1.armstrong();
		if(temp==ob1.sum)
		{
			System.out.println("Enter Number is Armstrong");
		}
		else
		{
			System.out.println("Enter Number is Not Armstrong");
		}
	}
	public static void main(String[]args)
	{
		Armstrong ob = new Armstrong();
		ob.arm();
	}
}		
