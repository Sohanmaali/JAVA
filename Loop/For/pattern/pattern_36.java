/*
          *
        * * *
      * * * * *
    * * * * * * *
  * * * * * * * * *
    * * * * * * *
      * * * * *
        * * *
          *
*/
import java.util.Scanner;
class Pattern_36
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int row = sc.nextInt();
		int k = row-1;
		int l=1;int x=3;
	/*for(int i=1;i<=(row<<1)-1;i++)
		{
			if(i<=row)
			{
				for(int j=1;j<=(row<<1);j++)
				{
					if(j>row-i+1&&j<=(row<<1)-k)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}
				k--;
				System.out.print("\n");
			}
			else
			{
				for(int j=1;j<=(row<<1);j++)
				{
					if(j>l+1&&j<=(row<<1)-l)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}
				l++;
				System.out.print("\n");
			}
		}*/
	
		for(int i=1;i<=(row<<1)-1;i++)
		{
			for(int j=1;j<=(row<<1);j++)
			{
				if(((i<=row)&&(j>row-i+1&&j<=(row<<1)-k))||((i>row)&&(j>=x&&j<=(row<<1)-l)))
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			if(i>row)
			{
				x++;
				l++;
			}
			else
				k--;
			System.out.print("\n");
		}	
	}
}
