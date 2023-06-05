
//WAP factoriyal Serices sum 1!/2 - 2!/3 + 3!/4 - 4!/5  + 5!/6 = 16.533333
import java.util.Scanner;
class  Factorial_seri9
{
	public static void main(String[]args)                                  
	{
		int n,i=1,j=2;
		float sum=0,fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();
		
		while (i<=n)
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
				
			
			i++;
			j++;
		}
		System.out.println(" = "+sum);
	}
}

