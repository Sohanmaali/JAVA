
//WAP to -x^1/2 + x^2/3 - x^3/4 + x^4/5 - x^5/6  = - 3.8000002
import java.util.Scanner;
class Series_12
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int x,y,i=1,j=2;
		float pow=1,sum=0;
		System.out.println("Enter any two number");
		x = sc.nextInt();
		y = sc.nextInt();
		do
		{
			pow = pow*x;
			if(i%2==0)
			{
				sum+=pow/j;
				System.out.print(" + "+x+"^"+i+"/"+j);
			}
			else 
			{
				sum-=pow/j;
				
				System.out.print(" - "+x+"^"+i+"/"+j);
			}	
			i++;
			j++;
		}while(i<=y);
		System.out.println(" = "+sum);
	}
}