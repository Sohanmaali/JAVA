
//WAP factoriyal Serices sum 1/1! + 2/2! + 3/3! + 4/4! + 5/5! = 2.7083335
import java.util.Scanner;
class Factorial_5
{
	public static void main(String[]args)                                  
	{
		int n,i;
		float sum=0,fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			fact*=i;
			sum=sum+i/fact;
			///System.out.println(sum);
			
			if(i<n)
			{
				System.out.print(i+"/"+i+"! + ");
			}
		}
		System.out.println(n+"/"+n+"! = "+sum);
	}
		
}

