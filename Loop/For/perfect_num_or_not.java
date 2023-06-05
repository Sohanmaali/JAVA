import java.util.Scanner;
class PerfectNum
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int num = sc.nextInt();
		int sum = 0;
		for(int i = 1; i<num; i++)
		{
			if(num%i==0)
			{
				sum+=i;
			}
		}
		if(num==sum)
		{
			System.out.println("Enter Num is perfect");
		}
		else
		{
			System.out.println("Enter Num is Not perfect");
		}
	}
}