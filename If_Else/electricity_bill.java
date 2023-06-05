import java.util.Scanner;
class Electrecitiy
{
public static void main(String[]args)                                  
{
float unit1, unit2,total,bill;

  	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter last month unite");
  	 unit1 = sc.nextFloat();
	 
	 System.out.println("Enter corrent month unite");
  	 unit2 = sc.nextFloat();
	 
	 total=unit1+unit2;
	 
	if(total>0||total<=100)
	{
		bill=total*5f;
		System.out.println("Your bill is = "+bill);
	}
	 if(total>100||total<=200)
	{
		bill=total*7.50f;
		System.out.println("Your bill is = "+bill);
	}
	if(total>200||total<=300)
	{
		bill=total*12.50f;
		System.out.println("Your bill is = "+bill);
	}
	if(total>300)
	{
		bill=total*16f;
		System.out.println("Your bill is = "+bill);
	}
}
}