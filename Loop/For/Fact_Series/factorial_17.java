
//WAP factoriyal Serices sum 2/1! + 4/2! + 6/3! + 8/4! +10/5! = 5.416667
import java.util.Scanner;
class Factorial_seri17
{
	public static void main(String[]args)                                  
	{
		int n,i,j;
		float sum=0,fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();
		
		for(i=1,j=2;i<=n;i++,j=j+2)
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

