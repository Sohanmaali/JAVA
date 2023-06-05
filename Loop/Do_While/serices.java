//Serices 1-2+3-4+5-6+7
import java.util.Scanner;
class Serices
{
	public static void main(String[]args)                                  
	{
		int n,i=1,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();
		
		System.out.println("First "+n+" number's sum");
		do
		{
			if(i%2==0)
			{
				sum-=i;
				System.out.print(" - "+i);
			}
			else
			{
				sum+=i;
				if(i>1)
					System.out.print(" + ");
				System.out.print(i);
				
			}
			i++;	
		}while(i<=n);
		System.out.println(" = "+sum);
	}
}