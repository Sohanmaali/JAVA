
//WAP Fectoriyal Serices sum 1/1! + 3/2! + 5/3! + 7/4! + 9/5! =  3.7
import java.util.Scanner;
class Factorial_seri23
{
	public static void main(String[]args)                                  
	{
		int n,i=1,j=1;
		float sum=0,fect=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();
		
		while (i<=n)
		{
			fect=fect*i;
			
			sum=sum+(j/fect);
				if(i>1)
				{
					System.out.print(" + ");
				}
				System.out.print(j+"/"+i+"!");
			i++;
			j = j+2;
		}
		System.out.println(" = "+sum);
	}
}

