import java.util.Scanner;
class Salary
{
public static void main(String[]args)                                  
{
	int sal;
	float pf,da,ta,grow;
  	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter any Salary amout");
  	sal = sc.nextInt();
	
	//pf=(sal*12.5f)/100;
	da=(sal*7.58f)/100;
	ta=(sal*3.6f)/100;
	
	grow=sal+da+ta;
	
	//System.out.println("PF = "+pf);
	System.out.println("DA = "+da);
	System.out.println("TA = "+ta);
	System.out.println("Net salary = "+((grow*12.5)/100));
	System.out.println("Grow Salary = "+grow);
	
	
 	
	
}
}