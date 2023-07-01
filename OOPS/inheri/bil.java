import java.util.Scanner;
class Perent
{
	int unit1, unit2;
	public void setData(int unit1,int unit2)
	{
		this.unit1 = unit1;
		this.unit2 = unit2;
	}
	public float bill()
	{
		return ((this.unit1+this.unit2)*5f);
	}
}
class Bill extends Perent
{	
	public float bill(int unit1,int unit2, float charge)
	{
		this.setData(unit1,unit2);
		return this.bill()*charge/100;
	}
}
class Main
{
	public static void main(String[]args)                                  
	{
		int unit1, unit2;

		Scanner sc = new Scanner(System.in);
		Bill ob = new Bill();
		System.out.println("Enter last month unite");
		unit1 = sc.nextInt();
 
		System.out.println("Enter corrent month unite");
		unit2 = sc.nextInt();
	
		int total=unit1+unit2;
	
		if(total>0||total<=100)
		{
			ob.setData(unit1,unit2);
			System.out.println("Your bill is = "+ob.bill());
		}
		if(total>100)
		{
			System.out.println("Enter corrent month unite");
			float charge = sc.nextFloat();
			System.out.println("Your bill is = "+ob.bill(unit1,unit2,charge));
		}
	}
}