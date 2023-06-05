//WAP to x^1/1 - x^2/2 + x^3/3 - x^4/4 + x^5/5 =  5.0666666

import java.util.Scanner;
class Series_5
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two num ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		float sum = 0,power= 1;
		for(int i = 1; i<=y; i++)
		{
			power*=x;
			if(i%2==0)
			{
				sum-=power/i;
				System.out.print(" - "+x+"^"+i+"/"+i);
			}
			else
			{
				sum+=power/i;
				if(i>1)
					System.out.print(" + ");
				System.out.print(x+"^"+i+"/"+i);
			}
		}
		System.out.print(" = "+sum);
	
	}
}