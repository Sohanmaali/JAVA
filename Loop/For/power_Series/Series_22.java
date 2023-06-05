
//WAP to x^1/1! + x^2/2! + x^3/3! + x^4/4! + x^5/5!  =  6.266667
import java.util.Scanner;
class Series_22
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter any two number");
		int x = sc.nextInt();
		int y = sc.nextInt();
		float sum=0,pow=1,fact=1;
		for(int i=1;i<=y;i++)
		{
			pow = pow*x;
			fact*=i;
			sum=sum +(pow/fact);
			
			
			if(i>1)
				System.out.print(" + ");
			System.out.print(x+"^"+i+"/"+i+"!");
		}
		System.out.println(" = "+sum);
	}
}