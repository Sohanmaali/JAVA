import java.util.Scanner;
class Quabe
{
public static void main(String[]args)                                  
{
	int a,qube;

  	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter first arm ");
	a=sc.nextInt();
	
  	qube=a*a*a;
	System.out.println("quabe of "+a+ " = "+qube);
	
}
}