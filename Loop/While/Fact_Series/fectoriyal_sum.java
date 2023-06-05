 
//WAP Fectoriyal Serices sum 1!+2!+3!+4!+5!
import java.util.Scanner;
class Factorial_sum
{
	public static void main(String[]args)                                  
	{
		int n,i=1,fect=1,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();
		
		while (i<=n)
		{
			fect*=i;
			sum+=fect;
			
			if(i<n)
			{
				System.out.print("!"+i+" + ");
			}
			i++;
		}
		System.out.println("!"+n+" = "+sum);
	}
}