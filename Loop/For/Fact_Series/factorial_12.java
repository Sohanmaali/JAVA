
//WAP factoriyal Serices sum 2/1! - 3/2! + 4/3! - 5/4!  + 6/5! = 1.0083334
import java.util.Scanner;
class  Factorial_12
{
	public static void main(String[]args)                                  
	{
		int n,i,j;
		float sum=0,fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();
		
		for(i=1,j=2;i<=n;i++,j++)
		{
			fact*=i;
			if(i%2==0)
			{
				sum = sum - (j/fact);
				System.out.print(" -"+j+"/"+i+"!");
			}
			else
			{
				sum = sum + (j/fact);
				if(i>1)
					System.out.print(" + ");
				System.out.print(j+"/"+i+"!");
			}
		}
		System.out.println(" = "+sum);
	}
}

