
//WAP Fectoriyal Serices sum -1!+2!-3!+4!-5! =-101 
import java.util.Scanner;
class Fectoriyal_seri1
{
	public static void main(String[]args)                                  
	{
		int n,i,fect=1,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			fect*=i;
			if(i%2==0)
			{
				sum+=fect;
				System.out.print(" + "+i+"!");
			}
			else
			{
				sum-=fect;
				System.out.print(" - "+i+"!");
			}
			
		}
		System.out.println(" = "+sum);
	}
}

