import java.util.Scanner;
class Divisival
{
	public static void main(String[]args)
	{
		int num,ans;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		num = sc.nextInt();
		
		ans = (num%5==0&&num%11==0?1:2);
		
		switch (ans)
		{
			case 1:
				System.out.println("Divisival by 5 & 11");
				break;
			case 2:
				System.out.println("Not Divisival by 5 & 11");
				break;
			default :
				System.out.println("Invalide input !");
		}
		
	}
}