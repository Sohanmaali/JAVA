//Fibbonaci

import java.util.Scanner;
class DataClass
{
	int a=-1,b=1,n;
	
	public int  fibbonacci()
	{
		int sum;
		sum = this.a+this.b;
		
		this.a = this.b;
		this.b = sum;
		return sum;
	}
}
class Fibbonaci
{
	public void run()
	{
		DataClass ob1 = new DataClass();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		ob1.n = sc.nextInt();
		
		System.out.println("Even number : ");
		for(int i = 1;i<=n;i++)
		{
			System.out.print(ob1.fibbonacci()+" ");
		}
	}
	public static void main(String[]args)
	{
		Fibbonaci ob = new Fibbonaci();
		ob.run();
	}
}		
