

//WAP to calculate HCF of Two given number.

import java.util.Scanner;
class Hcf
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n1,n2,hcf;
		
		System.out.println("Enter any two number");
		
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		Hcf obj = new Hcf();
		
		hcf = obj.hcf1(n1,n2);
		
		System.out.println(hcf);
	}	
	int hcf1(int n1,int n2)
	{
		int hcf;
		while(n1!=n2)
		{
			if(n1>n2)
			{
				n1=n1-n2;
			}
			else 
			{
				n2=n2-n1;
			}
		}
		hcf=n1;
		return hcf;
	}
	
}