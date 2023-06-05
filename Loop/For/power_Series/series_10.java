//WAP to x^1/2 + x^2/3 + x^3/4 + x^4/5 + x^5/6 = 12.866

import java.util.Scanner;
class Series_10
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two num ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		float sum = 0,power= 1;
		for(int i = 1,j=2; i<=y; i++,j++)
		{
			power *=x;
			sum+=power/j;
			if(i>1)
				System.out.print(" + ");
			System.out.print(x+"^"+i+"/"+j);
		}
		System.out.print(" = "+sum);
	}
}