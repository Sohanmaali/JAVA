import java.util.Scanner;
class Operator
{
public static void main(String[]args)
{
  	Scanner sc =new Scanner(System.in);
	System.out.println("Enter any two num");
  	int a = sc.nextInt();
 	int b = sc.nextInt();
	
	System.out.println("a==b "+(a==b));
	System.out.println("a!=b "+(a!=b));
	System.out.println("a>b "+(a>b));
	System.out.println("a>=b "+(a>=b));
	System.out.println("a<b "+(a<b));
	System.out.println("a<=b "+(a<=b));
	
}
}