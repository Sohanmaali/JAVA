
//WAP Fectoriyal Serices sum -1!/1 + 2!/3 - 3!/5 + 4!/7 + 5!/9 = -11.438095
import java.util.Scanner;
class Factorial_seri22
{
	public static void main(String[]args)
	{
		int n,i=1,j=1;
		float sum=0,fect=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();

		while (i<=n)
		{
			fect*=i;
			if(i%2==0)
			{
				sum=sum+(fect/j);
				System.out.print(" - "+i+"!/"+j);
			}
			else
			{
				sum=sum-(fect/j);
				if(i>1)
				{
					System.out.print(" + ");
				}
				System.out.print(i+"!/"+j);
			}

			i++;
			j=j+2;
		}
		System.out.println(" = "+sum);
	}
}

