import java.util.Scanner;
class PrintStrong
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
			int sum = 0,temp=num1;
			
			for(;temp>0;temp/=10)
			{
				int rem = temp%10;
				int fact,i;
				
				for(fact = 1,i=1;i<=rem;fact*=i,i++);
				//System.out.println(fact);
				sum+=fact;
			}
			if(sum==num1)
			{
				System.out.println(num1+" ");
			}
		}
	}
}