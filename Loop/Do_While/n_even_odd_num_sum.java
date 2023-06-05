//n_even_odd_num_Sum

import java.util.Scanner;
class EvenOddSum
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int n,i=1,ans=0,esum=0,osum=0;
		System.out.println("Enter any number");
		n = sc.nextInt();
		
		do
		{
			if(i%2==0)
			{
				esum += i;
			}
			else
			{
				osum+=i;
			}
			
			
			i++;
		}while(i<=n);
		System.out.println("Even number  Sum : "+ esum);
		System.out.println("Even number  Sum : "+ osum);
	}
}