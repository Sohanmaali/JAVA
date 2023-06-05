import java.util.Scanner;
class Trangale
{
public static void main(String[]args)                                  
{
	float num1,num2,num3,total;
  	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter any three num ");
  	 num1 = sc.nextFloat();
	 num2 = sc.nextFloat();
	 num3 = sc.nextFloat();
	 
	 total=num1+num2+num3;
	if(total==180)
	{
		System.out.println("Valide Trangale");
	}
	else
	{
		System.out.println("Invalide Trangale");
	}
}
}