
//WAP to x^1 - x^2 + x^3 - x^4 + x^5 = 22
import java.util.Scanner;
class Series_2
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int x,y,i=1;
		int pow=1,sum=0;
		System.out.println("Enter any two number");
		x = sc.nextInt();
		y = sc.nextInt();
		do
		{
			pow = pow*x;
			if(i%2==0)
			{
				sum-=pow;
				System.out.print(" - "+x+"^"+i);
			}
			else 
			{
				sum+=pow;
				if(i>1)
					System.out.print(" + ");
				System.out.print(x+"^"+i);
			}	
			i++;
		}while(i<=y);
		System.out.println(" = "+sum);
	}
}