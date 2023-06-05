//N even odd num squr

import java.util.Scanner;
class NevenOdd
{
  public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int x = sc.nextInt();
		System.out.println("Even number : ");
		for(int i = 1;i<=x;i++)
		{
			int even = i*2;
			System.out.print(even+" ");
		}
		System.out.println("\nodd number : ");
		for(int i = 1;i<=x;i++)
		{
			int odd = i*2-1;
			System.out.print(odd+" ");
		}
	}
}		
