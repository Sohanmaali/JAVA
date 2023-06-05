
//WAP factoriyal Serices sum 2/1! + 4/2! + 6/3! + 8/4! +10/5! = 5.416667
import java.util.Scanner;
class Serices_18
{
	public static void main(String[]args)                                  
	{
		int n,i=1,j=2;
		float sum=0,fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();
		
		do
		{
			fact=fact*i;
			
			sum=sum+(j/fact);
				if(i>1)
				{
					System.out.print(" + ");
				}
				System.out.print(j+"/"+i+"!");
			i++;
			j=j+2;;
		}while (i<=n);
		System.out.println(" = "+sum);
	}
}

