import java.util.Scanner;
class PrintNPrime
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Starting number ");
		int i = sc.nextInt();

		System.out.println("Enter number of prime number ");
		int num = sc.nextInt();
		
		int digit=0;
		
		for(;;i++)
		{
			int count = 0;
			for(int j = 2;j<i; j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==0 && i>1)
			{
				System.out.print(i+" ");
				digit++;
			}
			if(digit==num)
			{
				break;
			}
		}
	}
}