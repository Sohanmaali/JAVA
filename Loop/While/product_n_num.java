

import java.util.Scanner;
class Product
{
	public static void main(String[]args)                                  
	{
		int n,i=1,pro=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();
		
		while (i<=n)
		{
			pro = pro * i;
			if(i<n)
			{
				System.out.print(i+" * ");
			}
			i++;
		}
		System.out.println(n+" = "+pro);
	}
}