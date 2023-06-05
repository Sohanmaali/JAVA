
//WAP Factorial Serices sum 1!-2!+3!-4!+5! = 101
import java.util.Scanner;
class Factoriyal_serisum
{
	public static void main(String[]args)                                  
	{
		int n,i=1,fact=1,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();
		
		while (i<=n)
		{
			fact*=i;
			if(i%2==0)
			{
				sum-=fact;
				
				System.out.print(" - "+i+"!");
			}
			else
			{
				sum+=fact;
				if(i>1)
					System.out.print(" + ");
				System.out.print(i+"!");
			}
			i++;
		}
		System.out.println(" = "+sum);
	}
}

