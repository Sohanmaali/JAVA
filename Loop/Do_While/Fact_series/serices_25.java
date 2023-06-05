
//WAP factoriyal Serices sum 1/1! - 3/2! + 5/3! - 7/4!  + 9/5! = 0.11666666
import java.util.Scanner;
class  Serices_25
{
	public static void main(String[]args)                                  
	{
		int n,i=1,j=1;
		float sum=0,fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();
		
		do
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
			i++;
			j=j+2;
		}while (i<=n);
		System.out.println(" = "+sum);
	}
}

