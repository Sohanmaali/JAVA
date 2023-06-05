//WAP Fectoriyal Serices sum -1!+2!-3!+4!-5! = -101
import java.util.Scanner;
class Serices_3
{
	public static void main(String[]args)
	{
		int fact=1,i=1,n,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();
		do
		{
			fact*=i;
			if(i%2==0)
			{
				sum+=fact;
				System.out.print(" + "+i+"!");
			}
			else
			{
				sum-=fact;
				
			System.out.print(" - "+i+"!");
			}
			
			i++;
		}while(i<=n);
		System.out.println(" = "+sum);
	}
}