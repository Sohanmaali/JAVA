//HCF

import java.util.Scanner;
class Hcf
{
  public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two num");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int power = 1;
		
		for(;x!=y;)
		{
			if(x>y)
			{
				x=x-y;
			}
			else
			{
				y-=x;
			}
		}
		int hcf = x;
			
		System.out.println("HCF = "+hcf);
	}
}		
