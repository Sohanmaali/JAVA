import java.util.Scanner;
class Sss
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of row");
		int row = sc.nextInt();
		int j=1;
		int sum=0;
		/*int count=0;
		for(int x=1;;x++)
		{
			if(x%1==0&&x%2==0&&x%3==0&&x%4==0&&x%5==0&&x%6==0&&x%7==0&&x%8==0&&x%9==0&&x%10==0)
			{
				System.out.println(x+" ");
				count++;
			}
			if(count ==10)
				break;
		}
		*/
		
		for(int i=1; i<=row; i++)
		{
			sum+=i;
			System.out.print("* ");
			
			if(sum==i&&)
			{
				System.out.println("_");
			}	
			j++;
			if(sum==row*3&&j==row)
			{
				break;
			}	
		}
	}
}