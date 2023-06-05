////WAP to Qube of first n num sum

import java.util.Scanner;
class CubeSericeSum
{
	public static void main(String[]args)                                  
	{
		int n,i=1,sum=0,num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();
		
		System.out.println("First "+n+" number's Qube");
		do
		{
			 num = i*i*i;
			sum+=num;
			if(i<n)
			System.out.print(num+" + ");
			i++;			
		}while (i<=n);
		System.out.println(num+" = "+sum);
	}
}
