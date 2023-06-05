


//WAP to print first n odd netural num


import java.util.Scanner;
class NevenNum
{
	public static void main(String[]args)                                  
	{
		int n,i=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();
		
		System.out.println("First "+n+" Odd num");
		while (i<=n)
		{
			int num= i*2-1;
			System.out.print(num+" ");
			
			i++;			
		}
	}
}

