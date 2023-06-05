//Sum Even odd num

import java.util.Scanner;
class SumEvenOdd
{
  public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int n = sc.nextInt();
		
		int esum = 0,osum=0;
		int i =1;
		System.out.print("Sum of even num : ");
		for(; i<=n; i++)
		{
			if(i%2==0)
			{
				esum+=i;
				System.out.print(i+" + ");			
			}
		}
		System.out.println(" = "+esum);
		
		System.out.print("Sum of odd num : ");
		i=1;
		for(; i<=n; i++)
		{
			if(i%2!=0)
			{
				osum+=i;
				System.out.print(i+" + ");
			}
				
		}		
		System.out.print(" = "+osum);
	}
}