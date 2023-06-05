import java.util.Scanner;
class PrintPrime
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter starting num");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Ending num");
		int num2 = sc.nextInt();
		for(;num1<=num2;num1++)
		{
			int count = 0;
			for(int i = 2;i<num1;i++)
			{
				if(num1%i==0)
				{
					count++;
				}
			}
			if(count==0 && num1>1)
			{
				System.out.print(num1+" ");
			}
		}
	}
}