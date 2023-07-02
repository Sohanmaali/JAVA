import java.util.Scanner;
class Togal
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Ending Latter");
		char ch= sc.next().charAt(0);
		char n;
		if(ch>='A'&&ch<='Z')
		{
			n='A';
			for(;n<=ch;n++)
			{
				if(n%2!=0)
				{
					System.out.print(n+" ");
				}
				else
				{
					char z = (char)(n+32);
					System.out.print(z+" ");
				}
			}
		}
		else
		{
			n = 'a';
			for(;n<=ch;n++)
			{
				if(n%2!=0)
				{
					char z = (char)(n-32);
					System.out.print(z+" ");
				}
				else
				{
					
					System.out.print(n+" ");
				}
			}
		}
	}
}