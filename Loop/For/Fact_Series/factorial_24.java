
//WAP factoriyal Serices sum 1/1! - 3/2! + 5/3! - 7/4!  + 9/5! = 0.11666666
import java.util.Scanner;
class  Factorial_24
{
	public static void main(String[]args)                                  
	{
		int n,i,j;
		float sum=0,fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();
		
		for(i=1,j=1;i<=n;i++,j+=2)
		{
			fact*=i;
			if(i%2==0)
			{
				sum = sum - (j/fact);
				System.out.print(" -"+j+"!/"+i);
			}
			else
			{
				sum = sum + (j/fact);
				if(i>1)
					System.out.print(" + ");
				System.out.print(j+"!/"+i);
			}
		}
		System.out.println(" = "+sum);
	}
}

