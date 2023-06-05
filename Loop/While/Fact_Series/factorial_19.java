
//WAP Fectoriyal Serices sum -2/1! + 4/2! - 6/3! + 8/4! + 10/5! =  -0.74999994
import java.util.Scanner;
class Factorial_seri19
{
	public static void main(String[]args)
	{
		int n,i=1,j=2;
		float sum=0,fect=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();

		while (i<=n)
		{
			fect*=i;
			if(i%2==0)
			{
				sum=sum+(j/fect);
				
				System.out.print(" + "+j+"/"+i+"!");
			}
			else
			{
				sum=sum-(j/fect);
				
				System.out.print(" - ");				
				System.out.print(j+"/"+i+"!");
			}

			i++;
			j=j+2;
		} 
		System.out.println(" = "+sum);
	}
}

