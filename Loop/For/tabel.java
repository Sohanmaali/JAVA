import java.util.Scanner;
class Tabel
{
	public static void main(String[]args)                                  
	{
		int n,i,tab;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();
		
		for(i=1;i<=10;i++)
		{
			tab = n * i;
			System.out.println(n+ " * "+i +" = "+tab);
		}
	}
}
