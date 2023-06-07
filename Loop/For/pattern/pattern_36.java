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
		int l=n-1,k=1,x=1;
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
	
		for(int i=1;i<=(n<<1)-1;i++)
		{
			for(int j=1;j<=(n<<1);j++)
			{
				if(((i<=n)&&(j>n-i+1&&j<=(n<<1)-l))||((i>n)&&(j>k+1&&j<=(n<<1)-x)))
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			l--;
			if(i>n)
			{
				k++;
				x++;
			}
			System.out.println("");
		}
	}
}