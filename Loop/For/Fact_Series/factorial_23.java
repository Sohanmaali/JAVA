
//WAP factoriyal Serices sum 1/1! + 3/2! + 5/3! + 7/4! + 9/5! =  3.7
import java.util.Scanner;
class Factorial_23
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
			fact=fact*i;
			
			sum=sum+(j/fact);
			if(i>1)
			{
				System.out.print(" + ");
			}
			System.out.print(j+"/"+i+"!");
		}
		System.out.println(" = "+sum);
	}
}

