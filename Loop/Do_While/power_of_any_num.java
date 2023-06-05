//power of any number

import java.util.Scanner;
class Power
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int x,y,i=1,power=1;
		System.out.println("Enter any two number");
		x = sc.nextInt();
		y = sc.nextInt();
		
		do
		{
				power*=x;
			i++;
		}while(i<=y);
		System.out.println("power of any number : "+power);
	}
	
}