
//WAP to 2/x^1 + 3/x^2 + 4/x^3 + 5/x^4 + 6/x^5 = 2.75
import java.util.Scanner;
class Series_13
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int x,y,i=1,j=2;
		float pow=1,sum=0;
		System.out.println("Enter any two number");
		x = sc.nextInt();
		y = sc.nextInt();
		do
		{
			pow = pow*x;
			sum+=(j/pow);
			
			System.out.print(j+"/"+x+"^"+i);
			if(i<y)
				System.out.print(" + ");
	
			i++;
			j++;
		}while(i<=y);
		System.out.println(" = "+sum);
	}
}