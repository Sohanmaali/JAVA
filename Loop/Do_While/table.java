//Tabel
import java.util.Scanner;
class Tabel
{
	public static void main(String[]args)                                  
	{
		int n,i=1,ans;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();
		do
		{
			ans = n*i;
			System.out.println(n+" * "+i+" = "+ans);
			i++;
		}while(i<=10);
	}
}