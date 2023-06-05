

//WAP to -2/x^1 + 3/x^2 - 4/x^3 + 5/x^4 - 6/x^5  =  - 0.625
import java.util.Scanner;
class Series_15
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter any two number");
		int x = sc.nextInt();
		int y = sc.nextInt();
		float pow=1,sum=0;
		for(int i = 1,j=2; i<=y; i++,j++)
		{
			pow = pow*x;
			if(i%2==0)
			{
				sum+=(j/pow);
				System.out.print(" + "+j+"/"+x+"^"+i);
			}
			else 
			{
				sum-=(j/pow);
				
				System.out.print(" - "+j+"/"+x+"^"+i);
			}	
		}
		System.out.println(" = "+sum);
	}
}