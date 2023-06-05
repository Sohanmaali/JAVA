import java.util.Scanner;
class PrintPerfect
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
			int sum = 0;
			for(int i = 1; i<num1; i++)
			{
				if(num1%i==0)
				{
					sum+=i;
				}
			}
			if(num1==sum)
			{
				System.out.print(num1+" ");
			}
		}
	}
}