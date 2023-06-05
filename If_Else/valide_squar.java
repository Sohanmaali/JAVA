import java.util.Scanner;
class Valide
{
public static void main(String[]args)                                  
{
	int a,b;

  	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter first arm ");
	a=sc.nextInt();
	
	System.out.println("Enter second arm ");

	b=sc.nextInt();
	
  	if(a==b)
	{
	System.out.println("squar");
	}	
	else
	{
	System.out.println("not A squar");
	}
}
}