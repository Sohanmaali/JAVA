
//WAP Fectoriyal Serices sum 1!/2 + 2!/3 + 3!/5 + 4!/7 + 5!/9 =  19.62857
import java.util.Scanner;
class Serices_21
{
	public static void main(String[]args)                                  
	{
		int n,i=1,j=1;
		float sum=0,fect=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();
		
		do
		{
			fect=fect*i;
			
			sum=sum+(fect/j);
				if(i>1)
				{
					System.out.print(" + ");
				}
				System.out.print(i+"!/"+j);
			i++;
			j=j+2;
		}while (i<=n);
		System.out.println(" = "+sum);
	}
}

