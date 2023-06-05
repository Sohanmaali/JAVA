

//WAP to x^1 + x^2 + x^3 + x^4 + x^5 = 62
import java.util.Scanner;
class Series_1
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
			sum+=pow;
			
			System.out.print(n1+"^"+i);
			if(i<n2)
				System.out.print(" + ");
	
			i++;
		}
		System.out.println(" = "+sum);
	}
}