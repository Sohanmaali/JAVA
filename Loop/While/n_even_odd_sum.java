


//WAP to print n even odd num sum


import java.util.Scanner;
class EvenOddSum
{
	public static void main(String[]args)                                  
	{
		int n,i=1,esum=0,osum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();
		
		System.out.println("First "+n+" even odd num sum");
		while (i<=n)
		{
			if(i%2==0)
			{
				esum+=i;
			}
			else
			{
				osum+=i;
			}
			i++;
		}
		System.out.println("Sum of Even numbers = "+esum);
		System.out.println("Sum of Odd numbers = "+osum);
	}
}
