
//WAP factoriyal Serices sum -1!/2 + 2!/3 - 3!/4 + 4!/5 + 5!/6 = -16.533333
import java.util.Scanner;
class Factorial_10
{
	public static void main(String[]args)
	{
		int n,i,j;
		float sum=0,fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();

		for(i=1,j=2;i<=n;i++,j++)
		{
			fact*=i;
			if(i%2==0)
			{
				sum=sum+(fact/j);
				System.out.print(" + "+i+"!/"+j);
			}
			else
			{
				sum=sum-(fact/j);
				
				System.out.print(" - ");
				
				System.out.print(i+"!/"+j);
			}
		}
		System.out.println(" = "+sum);
	}
}

