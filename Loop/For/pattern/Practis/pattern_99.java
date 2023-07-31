
/*
        A
      1 2 3
    B C D E F
  4 5 6 7 8 9 10
G H I J K L M N O

*/

import java.util.Scanner;
class Pattern_99
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int row = sc.nextInt();
		int a=1;
		char x ='A'; 
		for(int i=1;i<=row;i++)
		{
			
			for(int j=1;j<=(row<<1);j++)
			{
				if(j>=row-i+1&&j<row+i)
				{
					if(i%2==0)
					{
						System.out.print(a+" ");
						a++;
					}
					else
					{
						System.out.print(x+" ");
						x++;
					}
				}
				else
				{
					System.out.print("  ");
				}
			}
			
			System.out.println("");
		}
	}
}