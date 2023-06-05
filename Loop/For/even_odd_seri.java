//even_odd_seri
import java.util.Scanner;
class EvenOddSeri
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int n = sc.nextInt();
		 
		System.out.println("Even number : ");
		for(int i = 1;i<=n;i++)
		{
			if(i%2==0)
			{
						System.out.print(i+" ");
			}
		}
		System.out.println("\nodd number : ");
		for(int i = 1;i<=n;i++)
		{
			if(i%2!=0)
			{
						System.out.print(i+" ");
			}
		}
	}
}