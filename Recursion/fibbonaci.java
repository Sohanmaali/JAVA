
import java.util.Scanner;
class Fibbonaci
{
	public int fibbonaci(int n)
	{
		if (n <=1)
		{
			return n;
		}
		return fibbonaci(n - 1) + fibbonaci(n - 2);
	}
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any num");
		
		int n = sc.nextInt();
		
		Fibbonaci ob = new Fibbonaci();
		for(int i=0;i<n;i++)
		{
			System.out.print(ob.fibbonaci(i)+" ");
		}
	}
}		
