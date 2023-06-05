import java.util.Scanner; 

class Convert
{
	public void decimalBainari()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter starting num");
		int  n = sc.nextInt();
		int bainari=0;
		for(int i=1;n>0;n/=2,i*=10)
		{
			int rem = n%2;
			
			bainari+=rem*i;
		}
		System.out.println("Decimal to bainary "+bainari);
	}
	public void bainariDecimal()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter starting num");
		int  n = sc.nextInt();
		int i=0,decimal=0;
		for(;n>0;n/=10)
		{
			int rem = n%10;
			int power =1;
			
			for(int j = 1;j<=i;j++)
			{
				power*=2;
			}
			decimal+=rem*power;
			i++;
		}
		System.out.println("Decimal to bainary "+decimal);
	}
	public void decimalOctal()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter starting num");
		int  n = sc.nextInt();
		int octal=0;
		for(int i=1;n>0;n/=8,i*=10)
		{
			int rem = n%8;
			
			octal+=rem*i;
		}
		System.out.println("Decimal to octal "+octal);
	}
	public void octalDecimal()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter starting num");
		int  n = sc.nextInt();
		int i=0,decimal=0;
		for(;n>0;n/=10)
		{
			int rem = n%10;
			int power =1;
			
			for(int j = 1;j<=i;j++)
			{
				power*=8;
			}
			decimal+=rem*power;
			i++;
		}
		System.out.println("Decimal to bainary "+decimal);
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Your choice are");
		System.out.println("\t1 For Decimal to bainari\n\t2 For bainar to Decimal \n\t3 For Decimal to octal\n\t4 For octal to Decimal");
		int choice = sc.nextInt();
		
		Convert ob = new Convert();
		
		switch(choice)
		{
			case 1:
				ob.decimalBainari();
				break;
			case 2:
				ob.bainariDecimal();
				break;
			case 3:
				ob.decimalOctal();
				break;
			case 4:
				ob.octalDecimal();
				break;
		}
	}
}
