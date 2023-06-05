
//WAP factoriyal Serices sum 1!/1 - 2!/2 + 3!/3 - 4!/4  + 5!/5 = 20.0
import java.util.Scanner;
class Serices_5
{
	public static void main(String[]args)                                  
	{
		int n,i=1;
		float sum=0,fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();
		
		do
		{
			fact*=i;
			if(i%2==0)
			{
				sum = sum - (fact/i);
				System.out.print(" - !"+i+"/"+i);
			}
			else
			{
				sum = sum + (fact/i);
				if(i>1)
					System.out.print(" + ");
				System.out.print(i+"!/"+i);
			}
				
			
			i++;
		}while (i<=n);
		System.out.println(" = "+sum);
	}
}

