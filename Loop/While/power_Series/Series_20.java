
//WAP to 1/x^1 - 3/x^2 + 5/x^3 - 7/x^4 + 9/x^5 =   0.21875
import java.util.Scanner;
class Series_20
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int n1,n2,i=1,j=1;
		
		float sum=0,pow=1;
		System.out.println("Enter any two number");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		while(i<=n2)
		{
			pow = pow*n1;
			if(i%2==0)
			{
				sum-=(j/pow);
				System.out.print(" - "+j+"/"+n1+"^"+i);
			}
			else 
			{
				sum+=(j/pow);
				if(i>1)
					System.out.print(" + ");
				System.out.print(+j+"/"+n1+"^"+i);
			}	
			i++;
			j+=2;
		}
		System.out.println(" = "+sum);
	}
}