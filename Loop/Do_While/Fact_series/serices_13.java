
//WAP Fectoriyal Serices sum 2/1! + 3/2! + 4/3! + 5/4! + 6/5! = 4.425
import java.util.Scanner;
class Serices_13
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
			
			sum=sum+(j/fect);
				if(i>1)
				{
					System.out.print(" + ");
				}
				System.out.print(j+"/"+i+"!");
			i++;
			j++;
		}
		System.out.println(" = "+sum);
	}
}

