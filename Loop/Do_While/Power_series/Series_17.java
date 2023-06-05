
//WAP to x^1/1 - x^2/3 + x^3/5 - x^4/7 + x^5/9 = 3.5365078
import java.util.Scanner;
class Series_17
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int x,y,i=1,j=1;
		float pow=1,sum=0;
		System.out.println("Enter any two number");
		x = sc.nextInt();
		y = sc.nextInt();
		do
		{
			pow = pow*x;
			if(i%2==0)
			{
				sum-=(pow/j);
				System.out.print(" - "+x+"^"+i+"/"+j);
			}
			else 
			{
				sum+=(pow/j);
				if(i>1)
					System.out.print(" + ");
				System.out.print(x+"^"+i+"/"+j);
			}	
			i++;
			j+=2;
		}while(i<=y);
		System.out.println(" = "+sum);
	}
}