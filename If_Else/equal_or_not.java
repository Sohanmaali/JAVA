import java.util.Scanner;
class CheckEqual
{
	public static void main(String[]args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter any two num");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a==b)
		{
			System.out.println("Both are Equal");
		}
		else if(a>b)
		{
			System.out.println(+a+" IS max......");
		}
		else
		{
		System.out.println(+b+" IS max......");
		}
	}
}