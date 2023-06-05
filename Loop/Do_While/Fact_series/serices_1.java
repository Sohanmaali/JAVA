//WAP Fectoriyal Serices sum 1!+2!+3!+4!+5! = 153
import java.util.Scanner;
class Serices_1
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
			sum+=fact;
			if(i>1)
				System.out.print(" + ");
			System.out.print(i+"!");
			i++;
		}while(i<=n);
		System.out.println(" = "+sum);
	}
}