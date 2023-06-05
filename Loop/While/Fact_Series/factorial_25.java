
//WAP Fectoriyal Serices sum -1/1! + 3/2! - 5/3! + 7/4! - 9/5! =  -0.11666666
import java.util.Scanner;
class Factorial_seri25
{
	public static void main(String[]args)                                  
	{
		int n,i=1,j=1;
		float sum=0,fect=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();
		
		while (i<=n)
		{
			fect*=i;
			if(i%2==0)
			{
				sum = sum + (j/fect);
				System.out.print(" +"+j+"!/"+i);
			}
			else
			{
				sum = sum - (j/fect);
				System.out.print(" - "+j+"!/"+i);
			}
			i++;
			j=j+2;
		}
		System.out.println(" = "+sum);
	}
}

