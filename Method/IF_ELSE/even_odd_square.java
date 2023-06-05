import java.util.Scanner; 

class EvenOddSquare
{
	public void evenSquare()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter turm num");
		int  n = sc.nextInt();
		
		for (int i = 1; i<=n;i++)
		{
			int even = i*2;
			int squar = even*even;
			System.out.println(squar+" ");
		}
	}
	public void oddSquare()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter turm num");
		int  n = sc.nextInt();
		
		for (int i = 1; i<=n;i++)
		{
			int odd = i*2-1;
			int squar = odd*odd;
			System.out.println(squar+" ");
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Your choice are");
		System.out.println("\t1 For Even Square serice\n\t2 For odd squar serice ");
		int choice = sc.nextInt();
		
		EvenOddSquare ob = new EvenOddSquare();
		
		switch(choice)
		{
			case 1:
				ob.evenSquare();
				break;
			case 2:
				ob.oddSquare();
				break;
			
		}
	}
}
