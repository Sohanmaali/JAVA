//sum_of_n

import java.util.Scanner;
class SumN
{
	public static void main(String[]args)                                  
	{
		int n,i=1,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();
		
		System.out.println("First "+n+" number's sum");
		do
		{
			sum+=i;
			if(i<n)
			System.out.print(i+" + ");
			i++;	
		}while(i<=n);
		System.out.println(n+" = "+sum);
	}
}