// HCF

import java.util.Scanner;
class Hcf
{
	public static void main(String[]args)                                  
	{
		int a,b,i=1,ans,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two num");
		a = sc.nextInt();
		b = sc.nextInt();
		do
		{
			if(a>b)
			{
				a=a-b;
			}
			else if(b>a)
			{
				b=b-a;
			}
		}while(a!=b);
		int hcf = a;
		System.out.println("HCF = "+hcf);
	}
}