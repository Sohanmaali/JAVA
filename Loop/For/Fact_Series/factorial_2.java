
//WAP factoriyal Serices sum 1!/1 + 2!/2 + 3!/3 + 4!/4 + 5!/5 = 34
import java.util.Scanner;
class Factorial_2
{
	public static void main(String[]args)                                  
	{
		int n,i;
		double sum=0,fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
			
			sum=sum+(fact/i);
			if(i>1)
			{
				System.out.print(" + ");
			}
			System.out.print(i+"!/"+i);
		}
		System.out.println(" + !"+n+"/"+n+" = "+sum);
	}
}

