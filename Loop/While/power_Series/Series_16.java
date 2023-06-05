

//WAP to x^1/1 + x^2/3 + x^3/5 + x^4/7 + x^5/9 = 10.77
import java.util.Scanner;
class Series_16
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int n1,n2,i=1,j=1;
		float pow=1,sum=0;
		System.out.println("Enter any two number");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		while(i<=n2)
		{
			pow = pow*n1;
			sum+=(pow/j);
			
			System.out.print(n1+"^"+i+"/"+j);
			if(i<n2)
				System.out.print(" + ");
	
			i++;
			j+=2;
		}
		System.out.println(" = "+sum);
	}
}