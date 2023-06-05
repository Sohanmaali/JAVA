import java.util.Scanner;
class EvenOdd
{
	public static void main(String[]args)
	{
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any num ");
		num = sc.nextInt();
		switch(num%2)
		{
			case 1:
			{
				System.out.print("Enter num is Odd");
				break;
			}
			case 0:
			{
				System.out.print("Enter num is Even");
				break;
			}
		}
	}
}