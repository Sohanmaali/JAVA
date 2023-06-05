
//WAP Fectoriyal Serices sum 1!/1 + 2!/2 + 3!/3 + 4!/4 + 5!/5 = 34
import java.util.Scanner;
class Factorial_seri2
{
	public static void main(String[]args)                                  
	{
		int n,i=1;
		double sum=0,fect=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();
		
		while (i<=n)
		{
			fect=fect*i;
			
			sum=sum+(fect/i);
				if(i>1)
				{
					System.out.print(" + ");
				}
				System.out.print(i+"!/"+i);
			
			i++;
		}
		System.out.println(" + !"+n+"/"+n+" = "+sum);
	}
}

