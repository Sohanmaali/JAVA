import java.util.Scanner; 

class DataClass
{
	private int n;
	public void setData(int n)
	{
		this.n = n;
	}
	public void evenSeri()
	{
		for (int i = 1; i<=this.n;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
		}
	}
	public void oddSeri()
	{
		for (int i = 1; i<=this.n;i++)
		{
			if(i%2!=0)
			{
				System.out.print(i+" ");
			}
		}
	}
	public void powerSeri()
	{
		int power=1;
		for (int i = 1; i<=this.n;i++)
		{
			power = i*i;
			System.out.print(power+" ");
		}
	}
}
class Serice
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		DataClass ob = new DataClass();
		
		System.out.println("Your choice are");
		System.out.println("\t1 For Even odd serice\n\t2 For squar serice ");
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		
		switch(choice)
		{
			case 1:
				System.out.println("Your choice are");
				System.out.println("\t1 For Even serice\n\t2 For odd serice ");
				choice = sc.nextInt();
				switch(choice)
				{
					case 1:
					System.out.println("Enter ending num");
					int  n = sc.nextInt();
					ob.setData(n);
						ob.evenSeri();
						break;
					case 2:
					System.out.println("Enter ending num");
					int  n = sc.nextInt();
					ob.setData(n);
					ob.oddSeri();
				}
				break;
			case 2:
				System.out.println("Enter ending num");
				int  n = sc.nextInt();
				ob.setData(n);
				ob.powerSeri();
				break;
		}
	}
}
