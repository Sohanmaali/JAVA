//octal_to_decimal
import java.util.Scanner;
class ODecimal
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int n = sc.nextInt();
		int decimal=0 ;
		int i,j;
		for(j=0;n>0;n/=10)
		{
			int rem = n%10;
			int power=1;
			for(i=1;i<=j;)
			{
				power*=8;
				i++;
			}
			decimal = decimal+power*rem;
			
			j++;
		}
		System.out.println("decimal = "+decimal);
	}
}