

import java.util.Scanner;
class MonthDay
{
	public static void main(String[]args)
	{
		int num,ans=-1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any 1-12 month num ");
		num = sc.nextInt();
		switch (num)
		{
			case 1:
				System.out.println("31 day in month");
				break;
			case 3:
				System.out.println("31 day in month");
				break;
			case 5:
				System.out.println("31 day in month");
				break;
			case 6:
				System.out.println("31 day in month");
				break;
			case 7:
				System.out.println("31 day in month");
				break;
			case 8:
				System.out.println("31 day in month");
				break;
			case 10:
				System.out.println("31 day in month");
				break;
			case 12:
				System.out.println("31 day in month");
				break;
			case 2:
				System.out.println("28 or 29 day in month");
				break;
			case 4:System.out.println("30 day in month");
				break;
			case 9:System.out.println("30 day in month");
				break;
			case 11:
			System.out.println("30 day in month");
			break;
			default :
			System.out.println("Invalide month name !");
		}
		
	}
}