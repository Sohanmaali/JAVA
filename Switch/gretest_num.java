

//Write a program to find maximum between two numbers using switch case.
import java.util.Scanner;
class Max
{
	public static void main(String[]args)
	{
		int num1,num2,ans;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two num");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		ans = (num1==num2?1:(num1>num2?2:3));
		switch(ans)
		{
			case 1:
				System.out.println("Both are equal.....");
				break;
			case 2:
				System.out.println("num1 is max.....");
				break;
			case 3:
				System.out.println("num2 is max.....");
				break;
		}
	}
}