//Power of any number

import java.util.Scanner;
class Power
{
  public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two num");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int power = 1;
		
		for(int i = 1;i<=y;power*=x,i++);
			
		System.out.println("power = "+power);
	}
}		
