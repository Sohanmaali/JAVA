import java.util.Scanner;
class Serice
{
	public static void main(String[]args)                                  
	{
		int n,i=1,sum=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();
		
		while (i<=n)
		{
			System.out.print(sum+" ");
			sum = sum + i;
			i++;
		}
	}
}
