import java.util.Scanner;
class prime
{
	public static void main(String[]args)
	{
		int n,count=0;
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				count++;
				break;
			}
		}
		if(n>1&&count==0)
			
		{
			System.out.println("Enter num is prime");
		}
		else
		{
			System.out.println("Enter num not is prime");
		}
	}
}