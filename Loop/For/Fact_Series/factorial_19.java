
//WAP factoriyal Serices sum -2/1! + 4/2! - 6/3! + 8/4! + 10/5! =  -0.74999994
import java.util.Scanner;
class Factorial_19
{
	public static void main(String[]args)
	{
		int n,i,j;
		float sum=0,fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();

		for(i=1,j=2;i<=n;i++,j+=2)
		{
			fact*=i;
			if(i%2==0)
			{
				sum=sum+(j/fact);
				
				System.out.print(" + "+j+"/"+i+"!");
			}
			else
			{
				sum=sum-(j/fact);
				
				System.out.print(" - ");				
				System.out.print(j+"/"+i+"!");
			}
		} 
		System.out.println(" = "+sum);
	}
}

