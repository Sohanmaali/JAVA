
//WAP to x^1 + x^2 + x^3 + x^4 + x^5 = 62 x=2

import java.util.Scanner;
class Series_1
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int x,y,i;
		int pow=1,sum=0;
		System.out.println("Enter any two number");
		x = sc.nextInt();
		y = sc.nextInt();
		for(i=1;i<=y;i++)
		{
			pow = pow*x;
			sum+=pow;
			
			System.out.print(x+"^"+i);
			if(i<y)
				System.out.print(" + ");
		}
		System.out.println(" = "+sum);
	}
}