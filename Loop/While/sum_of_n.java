import java.util.Scanner;
class Sum
{
	public static void main(String[]args)                                  
	{
		int n,i=1,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();
		
		while (i<=n)
		{
			sum = sum + i;
			if(i<n)
			{
				System.out.print(i+" + ");
			}
			i++;
		}
		System.out.println(n+" = "+sum);
	}
}