/*
        A
      A B A
    A B C B A
  A B C D C B A
A B C D E D C B A

*/
import java.util.Scanner;
class Pattern_23
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Row num");
		int row = sc.nextInt();
		int a=1;
		for(int i=1;i<=row;i++)
		{
			char ch ='A'-1;
			for(int j=1;j<row+i;j++)
			{
				if(j>=row-i+1)
				{
					ch = (j<=row?++ch:--ch);
					System.out.print(ch +" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			a++;
			System.out.println("");
		}
	}
}