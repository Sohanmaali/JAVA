// Armstrong or not
import java.util.Scanner;
class Armstrong
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int n = sc.nextInt();
		int count,temp = n,sum=0;
		
		for(count=0;n>0;count++,n/=10);
		
		//System.out.println(count);
		
		n = temp;
		
		for(;n>0;n/=10)
		{
			int rem = n%10;
			int i,power = 1;
			for(i=1;i<=count;i++)
			{
				power*=rem;
			}
			sum+=power;
		}
		//System.out.println(sum);
		if(temp==sum)
		{
			System.out.println("Armstrong num");
		}
		else
		{
			System.out.println("Not Armstrong num");
		}
	}
}