


//WAP to sum first n even netural num


import java.util.Scanner;
class NevenSum
{
	public static void main(String[]args)                                  
	{
		int n,i=1,sum=0,even = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();
		
		System.out.println("First "+n+" num even sum");
		while (i<=n)
		{
			even = i*2;
			sum =sum+ even;
			if(i<n)
			{
				System.out.print(even+" + ");
			}
			i++;			
		}
		System.out.print(even +" = " + sum);
	}
}

