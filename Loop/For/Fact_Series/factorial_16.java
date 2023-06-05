
//WAP factoriyal Serices sum -1!/2 + 2!/4 - 3!/6 + 4!/8 + 5!/10 = -10.0
import java.util.Scanner;
class Factorial_16
{
	public static void main(String[]args)
	{
		int n,i,j;
		float sum=0,fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();

		for(i=1,j=2;i<=n;i++,j+=2)
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
 
