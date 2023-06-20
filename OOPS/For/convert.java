//decimal_bainari
import java.util.Scanner;

class DataClass
{
	private int n;
	public void setData(int n)
	{
		this.n = n;
	}
	public int bainari()
	{
		int bain = 0,i=1;
		for(;this.n>0;n/=2)
		{
			bain+=n%2*i;
			i*=10;
		}
		return bain;
	}
	public int octal()
	{
		int bain = 0,i=1;
		for(;this.n>0;n/=8)
		{
			bain+=n%8*i;
			i*=10;
		}
		return bain;
	}
	public int decimal()
	{
		int deci = 0,i=0;
		for(;this.n>0;n/=10)
		{
			deci+=n%10*Math.pow(2,i);
			i++;
		}
		return deci;
	}
	public int decimal1()
	{
		int deci = 0,i=0;
		for(;this.n>0;n/=10)
		{
			deci+=n%10*Math.pow(8,i);
			i++;
		}
		return deci;
	}
}

class Convert
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		DataClass ob = new DataClass();
		
		System.out.println("Your choices are ");
		System.out.println("\t1 For Decimal To Bainari\n\t2 For Decimal To Octal");
		System.out.println("\t3 For Bainari To Decimal\n\t4 For Octal To Decimal");
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		System.out.println("Enter any num");
		int n = sc.nextInt();
		ob.setData(n);
		switch(choice)
		{
			case 1:
				System.out.println("decimal = "+ob.bainari());
				break;
			case 2:
				System.out.println("decimal = "+ob.octal());
				break;
			case 3:
				System.out.println("decimal = "+ob.decimal());
				break;
			case 4:
				System.out.println("decimal = "+ob.decimal1());
				break;
		}
		
	}
}