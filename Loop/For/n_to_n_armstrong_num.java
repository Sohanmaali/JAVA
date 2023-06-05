import java.util.Scanner;
class PrintArmstrong
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
			int temp = num1,count=0,sum = 0;
			for(;temp>0;temp/=10)
			{
				count++;
			}
			temp = num1;
			for(; temp>0; temp/=10)
			{
				int rem = temp%10;
				int i,power;
				for(i = 1,power = 1;i<=count;i++)
				{
					power*=rem;
				}
				sum+=power;
			}
			if(sum==num1)
			{
				System.out.print(num1+" ");
			}
		}
	}
}	