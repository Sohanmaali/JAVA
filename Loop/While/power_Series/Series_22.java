
//WAP to x^1/1! + x^2/2! + x^3/3! + x^4/4! + x^5/5!  =  6.266667
import java.util.Scanner;
class Series_22
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int n1,n2,i=1;
		float sum=0,pow=1,fact=1;
		System.out.println("Enter any two number");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		while(i<=n2)
		{
			pow = pow*n1;
			fact*=i;
			sum=sum +(pow/fact);
			
			System.out.print(n1+"^"+i+"/"+i+"!");
			if(i<n2)
				System.out.print(" + ");
	
			i++;
		}
		System.out.println(" = "+sum);
	}
}