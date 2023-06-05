
//WAP to -x^1 + x^2 - x^3 + x^4 - x^5  = -22
import java.util.Scanner;
class Series_3
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int n1,n2,i=1;
		int pow=1,sum=0;
		System.out.println("Enter any two number");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		while(i<=n2)
		{
			pow = pow*n1;
			if(i%2==0)
			{
				sum+=pow;
				System.out.print(" + "+n1+"^"+i);
			}
			else 
			{
				sum-=pow;
				
				System.out.print("-"+n1+"^"+i);
			}	
			i++;
		}
		System.out.println(" = "+sum);
	}
}