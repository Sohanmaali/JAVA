//Procuct n number

import java.util.Scanner;
class Product
{
  public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int n = sc.nextInt();
		
		int product = 1;
		for(int i =1; i<=n; i++)
		{
			product*=i;
			if(i<n)
				System.out.print(i+" * ");
		}
		System.out.println(n+" = "+product);
	}
}