//Fibbonaci

import java.util.Scanner;
class Fibbonaci
{
  public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int n = sc.nextInt();
		int a=-1,b=1,sum=0;
		System.out.println("Even number : ");
		for(int i = 1;i<=n;i++)
		{
			sum=a+b;
			System.out.print(sum+" ");
			a=b;
			b=sum;
		}
	}
}		
