
/*
I
IN
IND
INDI
INDIA
INDIA
INDI
IND
IN
I
*/

import java.util.Scanner;
class Pattern_29
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int row = sc.nextInt();
		char ind[] = {'I','N','D','I','A'};
		for(int i=0;i<=5<<1;i++)
		{
			if(i<=4)
			{
				for(int k=0;k<=i;k++)
				{
					System.out.print(ind[k]);
				}
				System.out.println("");
			}
			else
			{
				for(int k=0;k<=;k++)
				{
					System.out.print(ind[k]);
				}
			}
		}
	}
}