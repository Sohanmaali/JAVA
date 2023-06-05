
//WAP factoriyal Serices sum 1!/1 - 2!/3 + 3!/5 - 4!/7  + 5!/9 =  11.438095
import java.util.Scanner;
class  Factorial_21
{
	public static void main(String[]args)                                  
	{
		int n,i,j;
		float sum=0,fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();
		
		for(i=1,j=1;i<=n;i++,j+=2)
		{
			fact*=i;
			if(i%2==0)
			{
				sum = sum - (fact/j);
				System.out.print(" -"+i+"!/"+j);
			}
			else
			{
				sum = sum + (fact/j);
				if(i>1)
					System.out.print(" + ");
				System.out.print(i+"!/"+j);
			}
		}
		System.out.println(" = "+sum);
	}
}

