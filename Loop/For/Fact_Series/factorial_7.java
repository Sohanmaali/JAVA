
//WAP factoriyal Serices sum -1/1! + 2/2! - 3/3! + 4/4! - 5/5! = -0.37499997
import java.util.Scanner;
class Factorial_7
{
	public static void main(String[]args)
	{
		int n,i;
		float sum=0,fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();

		for(i=1;i<=n;i++)
		{
			fact*=i;
			if(i%2==0)
			{
				sum=sum+(i/fact);
				System.out.print(" + "+i+"/"+i+"!");
			}
			else
			{
				sum=sum-(i/fact);
				
				System.out.print(" - "+i+"/"+i+"!");
			}
		}
		System.out.println(" = "+sum);
	}
}

