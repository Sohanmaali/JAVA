import java.util.Scanner; 

class Trangale
{
	public void trangal()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three side of trangal");
		float side1 = sc.nextFloat();		
		float side2 = sc.nextFloat();		
		float side3 = sc.nextFloat();		
		
		if(side1==side2&&side2==side3)
		{
			System.out.println("Equliateral Trangale");
		}
		else if(side1==side2||side2==side3||side1==side3)
		{
			System.out.println("Scalener Trangale");
		}
		else
		{
			System.out.println("Isosceles Trangale");
		}
	}
	public static void main(String args[])
	{
		Trangale ob = new Trangale();
		ob.trangal();
	}
}
