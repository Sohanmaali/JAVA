import java.util.Scanner; 

class ElectricityBill
{
	public void bill()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter bill unite");
		float unite = sc.nextInt();
		float ans;
		if(unite<=100)
		{
			ans = unite*5f;
			System.out.println("Your electricity bill = "+ans);
		}
		else if(unite<=200)
		{
			ans = unite*7.5f;
			System.out.println("Your electricity bill = "+ans);
		}
		else if(unite<=300)
		{
			ans = unite*12.50f;
			System.out.println("Your electricity bill = "+ans);
		}
		else if(unite>300)
		{
			ans = unite*16f;
			System.out.println("Your electricity bill = "+ans);
		}
		else
		{
			System.out.println("Invalid Input");
		}
	}
	public static void main(String args[])
	{
		ElectricityBill ob = new ElectricityBill();
		ob.bill();
	}
}
