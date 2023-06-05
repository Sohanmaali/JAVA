
//WAP factoriyal Serices sum 1!/2 + 2!/3 + 3!/4 + 4!/5 + 5!/6 =  27.466666666
import java.util.Scanner;
class Factorial_8
{
	public static void main(String[]args)                                  
	{
		int n,i,j;
		float sum=0,fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();
		
		for(i=1,j=2;i<=n;i++,j++)
		{
			fact=fact*i;
			
			sum=sum+(fact/j);
			if(i>1)
			{
				System.out.print(" + ");
			}
			System.out.print(i+"!/"+j);
		}
		System.out.println(" = "+sum);
	}
}

