
//WAP Fectoriyal Serices sum 2/1! - 3/2! + 4/3! - 5/4!  + 6/5! = 1.0083334
import java.util.Scanner;
class  Serices_14
{
	public static void main(String[]args)                                  
	{
		int n,i=1,j=2;
		float sum=0,fect=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();
		
		do
		{
			fect*=i;
			if(i%2==0)
			{
				sum = sum - (j/fect);
				System.out.print(" -"+j+"!/"+i);
			}
			else
			{
				sum = sum + (j/fect);
				if(i>1)
					System.out.print(" + ");
				System.out.print(j+"!/"+i);
			}
			i++;
			j++;
		}while (i<=n);
		System.out.println(" = "+sum);
	}
}

