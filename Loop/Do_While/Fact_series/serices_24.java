
//WAP factoriyal Serices sum 1/1! + 3/2! + 5/3! + 7/4! + 9/5! =  3.7
import java.util.Scanner;
class Serices_24
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
			fact=fact*i;
			
			sum=sum+(j/fact);
				if(i>1)
				{
					System.out.print(" + ");
				}
				System.out.print(j+"/"+i+"!");
			i++;
			j = j+2;
		}while (i<=n);
		System.out.println(" = "+sum);
	}
}

