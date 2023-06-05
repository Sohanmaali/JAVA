
//WAP Fectoriyal Serices sum 1!/2 + 2!/4 + 3!/6 + 4!/8 + 5!/10 =  17.0
import java.util.Scanner;
class Factorial_seri14
{
	public static void main(String[]args)                                  
	{
		int n,i=1,j=2;
		float sum=0,fect=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();
		
		while (i<=n)
		{
			fect=fect*i;
			
			sum=sum+(fect/j);
				if(i>1)
				{
					System.out.print(" + ");
				}
				System.out.print(i+"!/"+j);
			i++;
			j=j+2;;
		}
		System.out.println(" = "+sum);
	}
}

