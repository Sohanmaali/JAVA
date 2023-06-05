import java.util.Scanner; 

class Power
{
	public void power()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter base and expond num");
		int  n = sc.nextInt();
		int  m = sc.nextInt();
		int power=1;
		for (int i = 1; i<=m;i++)
		{
			power*=n;
		}
		System.out.println("power = "+power);
	}
	public void powerSeri()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter ending num");
		int  n = sc.nextInt();
		int power=1;
		for (int i = 1; i<=n;i++)
		{
			power=i*i;
			System.out.print(power+" ");
		}
		
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Your choice are");
		System.out.println("\t1 For power of any num\n\t2 For squar serice ");
		int choice = sc.nextInt();
		
		Power ob = new Power();
		
		switch(choice)
		{
			case 1:
				ob.power();
				break;
			case 2:
				ob.powerSeri();
				break;
			
		}
	}
}
