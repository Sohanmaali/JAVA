
//Check whether a number is positive, negative or zero using a switch case.


import java.util.Scanner;
class CheckNp
{
	public static void main(String[]args)
	{
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any num ");
		num = sc.nextInt();
		
		int ans = (num>0? 1:(num<0?2:3));
		switch(ans)
		{
			case 1:
				System.out.println("positive num ");
				break;
			case 2:
				System.out.println("Negetive num ");
				break;
			case 3:
				System.out.println("ZERO");	
		}
	}
}
