


//WAP to sum of nums digit


import java.util.Scanner;
class SumDigit
{
	public static void main(String[]args)                                  
	{
		int n,sum=0,rem;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		System.out.println("First "+n+" num even sum");
		while (n>0)
		{
			rem = n%10;
			sum =sum + rem;
			n/=10;
					
		}
		System.out.print("Sum of Given number digits  = " + sum);
	}
}

