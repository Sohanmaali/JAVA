


//WAP to Qube of first n netural num


import java.util.Scanner;
class QubeSerice
{
	public static void main(String[]args)                                  
	{
		int n,i=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();
		
		System.out.println("First "+n+" number's Qube");
		while (i<=n)
		{
			int num = i*i*i;
			System.out.print(num+" ");
			i++;			
		}
	}
}
