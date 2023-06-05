
//WAP to -x^1/1 + x^2/3 - x^3/5 + x^4/7 - x^5/9  = -3.5365078
import java.util.Scanner;
class Series_18
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any two number");
		int x = sc.nextInt();
		int y = sc.nextInt();
		float pow=1,sum=0;
		for(int i=1,j=1;i<=y;i++,j+=2)
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
		}
		System.out.println(" = "+sum);
	}
}