//n_even_num_squr

import java.util.Scanner;
class EvenOddSqur
{
  public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int x = sc.nextInt();
		System.out.println("Even number : ");
		for(int i = 1;i<=x;i++)
		{
			if(i%2==0){
			int even= i*i;
			System.out.print(even+" ");
			}
		}
		System.out.println("\nodd number : ");
		for(int i = 1;i<=x;i++)
		{
			if(i%2!=0){
			int odd= i*i;
			System.out.print(odd+" ");
			}
		}
	}
}		
