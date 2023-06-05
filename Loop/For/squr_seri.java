//Squr Serices

import java.util.Scanner;
class Squr
{
  public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int n = sc.nextInt();
		
		int squr = 1;
		for(int i =1; i<=n; i++)
		{
			squr=i*i;
			System.out.print(squr+" ");
		}
		
	}
}