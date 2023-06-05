
//WAP Fectoriyal Serices sum -1!/2 + 2!/4 - 3!/6 + 4!/8 + 5!/10 = -10.0
import java.util.Scanner;
class Factorial_seri16
{
	public static void main(String[]args)
	{
		int n,i=1,j=2;
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
				System.out.print(" + "+i+"!/"+j);
			}
			else
			{
				sum=sum-(fect/j);
				
					System.out.print(" - ");
				
				System.out.print(i+"!/"+j);
			}

			i++;
			j=j+2;
		}
		System.out.println(" = "+sum);
	}
}
 
