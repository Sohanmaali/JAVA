import java.util.Scanner;
class Tabel
{
	public static void main(String[]args)                                  
	{
		int n,i=1,tab;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();
		
		while (i<=10)
		{
			tab = n * i;
			System.out.println(n+ " * "+i +" = "+tab);
			i++;
		}
	}
}
