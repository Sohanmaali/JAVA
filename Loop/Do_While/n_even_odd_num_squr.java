//n_even_odd_num_squr

import java.util.Scanner;
class EvenOddSqure
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int n,i=1,ans=0,squr;
		System.out.println("Enter any number");
		n = sc.nextInt();
		System.out.println("Even number  Squre :");
		do
		{
			ans = i*2;
			squr = ans*ans;
			System.out.print(squr+" ");
			i++;
		}while(i<=n);
		i=1;
		System.out.println("\nodd number  Squre :");
		do
		{
			ans = i*2-1;
			squr = ans*ans;
			System.out.print(squr+" ");
			i++;
		}while(i<=n);
	}
}