
//WAP to -x^1/2 + x^2/3 - x^3/4 + x^4/5 - x^5/6  = - 3.8000002
import java.util.Scanner;
class Series_12
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int n1,n2,i=1,j=2;
		float pow=1,sum=0;
		System.out.println("Enter any two number");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		while(i<=n2)
		{
			pow = pow*n1;
			if(i%2==0)
			{
				sum+=pow/j;
				System.out.print(" + "+n1+"^"+i+"/"+j);
			}
			else 
			{
				sum-=pow/j;
				
				System.out.print(" - "+n1+"^"+i+"/"+j);
			}	
			i++;
			j++;
		}
		System.out.println(" = "+sum);
	}
}