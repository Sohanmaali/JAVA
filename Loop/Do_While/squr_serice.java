//squr_serice

import java.util.Scanner;
class SqurSerice
{
	public static void main(String[]args)                                  
	{
		int n,i=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();
		
		System.out.println("First "+n+" number's squr");
		do
		{
			int num = i*i;
			System.out.print(num+" ");
			i++;			
		}while (i<=n);
	}
}
