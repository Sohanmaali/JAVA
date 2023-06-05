


//Serices 1-2+3-4+5-6+7


import java.util.Scanner;
class Serices1
{
	public static void main(String[]args)                                  
	{
		int n,i=1,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();
		
		System.out.println("First "+n+" even odd num sum");
		while (i<=n)
		{
			if(i%2==0)
			{
				sum-=i;
				System.out.print(" - "+i);
			}
			else
			{
				sum+=i;
				System.out.print(" + "+i);
			}
			i++;
		}
		System.out.println(" = "+sum);
		
	}
}
