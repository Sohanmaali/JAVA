//Squr Serices sum

import java.util.Scanner;
class SqurSum
{
  public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int n = sc.nextInt();
		
		int sum = 0,squr=1;
		for(int i =1; i<=n; i++)
		{
			squr=i*i;
			sum+=squr;
			if(i<n)
			System.out.print(squr+" + ");
		}
		System.out.print(squr+" = "+sum);
	}
}