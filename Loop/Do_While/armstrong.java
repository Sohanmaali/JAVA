//Armstrong Num
import java.util.Scanner;
class Armstrong
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int n = sc.nextInt();
		int temp = n,count=0,sum=0;
		do
		{
			count++;
			n/=10;
		}while(n>0);
		
		//System.out.println(count);
		n = temp;
		do
		{
			int i=1,power = 1;
			int rem= n%10;
			do
			{
				power*=rem;
				i++;
				
			}while(i<=count);
			sum+=power;
			n/=10;
		}while(n>0);
		if(sum==temp)
		{
			System.out.println("Armstrong num");
		}
		else
		{
			System.out.println("Not Armstrong num");
		}
	}
}