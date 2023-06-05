


//WAP to sum first n odd netural num


import java.util.Scanner;
class NoddSum
{
	public static void main(String[]args)                                  
	{
		int n,i=1,sum=0,num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();
		
		System.out.println("First "+n+" Odd num Sum");
		while (i<=n)
		{
			num = i*2-1;
			sum += num;
			if(i<n)
			{
				System.out.print(num+" + ");
			}
			i++;			
		}
		System.out.print(num +" = " + sum);
		
	}
}

