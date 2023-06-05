
//WAP Fectoriyal Serices sum 1/1! + 2/2! + 3/3! + 4/4! + 5/5! = 2.7083335
import java.util.Scanner;
class Fectoriyal_seri5
{
	public static void main(String[]args)                                  
	{
		int n,i=1;
		float sum=0,fect=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();
		
		while (i<=n)
		{
			fect*=i;
			sum=sum+i/fect;
			///System.out.println(sum);
			
			if(i<n)
			{
				System.out.print(i+"/"+i+"! + ");
			}
			i++;
		}
		System.out.println(n+"/"+n+"! = "+sum);
	}
		
}

