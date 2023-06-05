//even_odd_seri

import java.util.Scanner;
class Even_Odd
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int n,i=1,even,odd;
		System.out.println("Enter any number");
		n = sc.nextInt();
		System.out.println("Even Serices :");
		do
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
			i++;
		}while(i<=n);
		i=1;
		System.out.println("\nodd Serices :");
		do
		{
			if(i%2!=0)
			{
				System.out.print(i+" ");
			}
			i++;
		}while(i<=n);
	
	}
}
