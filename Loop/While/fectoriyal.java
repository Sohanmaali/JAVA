import java.util.Scanner;
class Fectoriyal
{
	public static void main(String[]args)                                  
	{
		int n,i=1,fect=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();
		
		while (i<=n)
		{
			fect*=i;
			i++;
		}
		System.out.println("Fectoriyal of " +n+ " = "+fect);
	}
}

