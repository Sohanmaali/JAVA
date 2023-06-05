//cube Serices

import java.util.Scanner;
class Cube
{
  public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int n = sc.nextInt();
		
		int cube = 1;
		for(int i =1; i<=n; i++)
		{
			cube=i*i*i;
			System.out.print(cube+" ");
		}
		
	}
}