
//WAP to Cube of first n netural num


import java.util.Scanner;
class CubeSerice
{
	public static void main(String[]args)                                  
	{
		int n,i=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();
		
		System.out.println("First "+n+" number's Qube");
		do
		{
			int num = i*i*i;
			System.out.print(num+" ");
			i++;			
		}while (i<=n);
	}
}
