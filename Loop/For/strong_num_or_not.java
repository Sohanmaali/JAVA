import java.util.Scanner;
class StrongNum
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int num = sc.nextInt();
		int fact,i,sum = 0,temp = num;
		for(;num>0;num/=10)
		{
			int rem = num%10;
			for(fact = 1,i=1;i<=rem;fact*=i,i++);
			//System.out.println(fact);
			sum+=fact;
		}
		//System.out.println(sum);
		if(sum==temp)
		{
			System.out.println("Enter num is strong num");
		}
		else
		{
			System.out.println("Enter num is not strong num");
		}
	}

}