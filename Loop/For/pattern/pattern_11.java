
/*
		1
      1 2 1
    1 2 3 2 1
  1 2 3 4 3 2 1
  */
//not complide
import java.util.Scanner;
class Pattern_11
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int row = sc.nextInt();
		int k=row-1;
		int l=1;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=row<<1;j++)
			{
				
				if(j>row-i+1&&j<=(row<<1)-k)
				{
					System.out.print(l+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			k--;
			System.out.print("\n");
		}
	}
}