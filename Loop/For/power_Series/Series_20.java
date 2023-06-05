
//WAP to 1/x^1 - 3/x^2 + 5/x^3 - 7/x^4 + 9/x^5 =   0.21875
import java.util.Scanner;
class Series_20
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter any two number");
		int x = sc.nextInt();
		int y = sc.nextInt();
		float sum=0,pow=1;
		for(int i=1,j=1;i<=y;i++,j+=2)
		{
			pow = pow*x;
			if(i%2==0)
			{
				sum-=(j/pow);
				System.out.print(" - "+j+"/"+x+"^"+i);
			}
			else 
			{
				sum+=(j/pow);
				if(i>1)
					System.out.print(" + ");
				System.out.print(+j+"/"+x+"^"+i);
			}	
		}
		System.out.println(" = "+sum);
	}
}