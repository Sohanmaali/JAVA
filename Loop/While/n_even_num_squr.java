


//WAP to print first n even num squar num


import java.util.Scanner;
class NevenSqur
{
	public static void main(String[]args)                                  
	{
		int n,i=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();
		
		System.out.println("First "+n+" Netural num Squr");
		while (i<=n)
		{
			int num= i*2;
			
			System.out.print(num*num+" ");
			
			i++;			
		}
	}
}

