//fibbonaci Serices

import java.util.Scanner;
class Fibbonaci
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int n,i=1,a=-1,b=1,sum=0;
		
		System.out.println("Enter any number");
		n = sc.nextInt();
		
		System.out.println("fibbonaci Serices :");
		do
		{
			sum=a+b;
			System.out.print(sum+" ");
			a=b;
			b= sum;
			i++;
		}while(i<=10);
	}
}
