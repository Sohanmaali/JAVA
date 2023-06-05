//n even number

import java.util.Scanner;
class EvenOdd
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int n,i=1,ans=0;
		System.out.println("Enter any number");
		n = sc.nextInt();
		System.out.println("Even number :");
		do
		{
			ans = i*2;
			i++;
			System.out.print(ans+" ");
		}while(i<=n);
		
		i=1;
		
		System.out.println("\nOdd number :");
		do
		{
			ans = i*2-1;
			i++;
			System.out.print(ans+" ");
		}while(i<=n);
	}
}