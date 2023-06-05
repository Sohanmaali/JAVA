

//WAP to x^1/1 + x^2/3 + x^3/5 + x^4/7 + x^5/9 = 10.77
import java.util.Scanner;
class Series_16
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
			sum+=(pow/j);
			
			System.out.print(x+"^"+i+"/"+j);
			if(i<y)
				System.out.print(" + ");
	
			i++;
			j+=2;
		}while(i<=y);
		System.out.println(" = "+sum);
	}
}