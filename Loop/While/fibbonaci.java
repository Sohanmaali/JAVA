import java.util.Scanner;
class Fibbo
{
	public static void main(String[]args)                                  
	{
		int n,i = 1,sum = 0,a = -1,b = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();

		while (i<=n)
		{
			sum = a + b;
			System.out.print(sum+" ");
			a = b;
			b = sum;
			i++;
		}
	}
}