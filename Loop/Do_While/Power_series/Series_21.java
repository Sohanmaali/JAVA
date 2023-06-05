
//WAP to -1/x^1 + 3/x^2 - 5/x^3 + 7/x^4 - 9/x^5  =   -0.21875l
import java.util.Scanner;
class Series_21
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int x,y,i=1,j=1;
		
		float sum=0,pow=1;
		System.out.println("Enter any two number");
		x = sc.nextInt();
		y = sc.nextInt();
		do
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
			i++;
			j+=2;
		}while(i<=y);
		System.out.println(" = "+sum);
	}
}