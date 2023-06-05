
//WAP Fectoriyal Serices sum 1!/1 + 2!/2 + 3!/3 + 4!/4 + 5!/5 = 34
import java.util.Scanner;
class Serices_4
{
	public static void main(String[]args)
	{
		int fact=1,i=1,n,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();
		do
		{
			fact*=i;
			sum+=fact/i;
			if(i>1)
				System.out.print(" + ");
			System.out.print(i+"!/"+i);
			i++;
			
		}while(i<=n);
		System.out.println(" = "+sum);
	}
}