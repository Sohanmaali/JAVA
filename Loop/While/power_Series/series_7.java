
//WAP to 1/x^1 + 2/x^2 + 3/x^3 + 4/x^4 + 5/x^5  =   1.78125
import java.util.Scanner;
class Series_7
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int n1,n2,i=1;
		float sum=0,pow=1;
		System.out.println("Enter any two number");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		while(i<=n2)
		{
			pow = pow*n1;
			sum=sum +(i/pow);
			
			System.out.print(n1+"^"+i+"/"+i);
			if(i<n2)
				System.out.print(" + ");
	
			i++;
		}
		System.out.println(" = "+sum);
	}
}