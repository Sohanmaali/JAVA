//product_n_num

import java.util.Scanner;
class Product
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int n,i=1,pro=1;
		System.out.println("Enter any number");
		n = sc.nextInt();
		int temp = n;
		do
		{
			pro*=i;
			if(i<n)
				System.out.print(i+" * ");
			i++;
		}while(i<=n);
		System.out.println(n+" = "+pro);
	}
}