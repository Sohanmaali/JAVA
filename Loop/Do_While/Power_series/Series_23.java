
//WAP to x^1/1! - x^2/2! + x^3/3! - x^4/4! + x^5/5! = 0.9333334
import java.util.Scanner;
class Series_23
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int x,y,i=1;
		float pow=1,sum=0,fact=1;
		System.out.println("Enter any two number");
		x = sc.nextInt();
		y = sc.nextInt();
		do
		{
			pow = pow*x;
			fact*=i;
			if(i%2==0)
			{
				sum-=pow/fact;
				System.out.print(" - "+x+"^"+i);
			}
			else 
			{
				sum+=pow/fact;
				if(i>1)
					System.out.print(" + ");
				System.out.print(x+"^"+i);
			}	
			i++;
		}while(i<=y);
		System.out.println(" = "+sum);
	}
}