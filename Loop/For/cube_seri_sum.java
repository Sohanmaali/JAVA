//cube Serices sum

import java.util.Scanner;
class CubeSum
{
  public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int n = sc.nextInt();
		
		int sum = 0,cube=1;
		for(int i =1; i<=n; i++)
		{
			cube=i*i*i;
			sum+=cube;
			if(i<n)
			System.out.print(cube+" + ");
		}
		System.out.print(cube+" = "+sum);
	}
}