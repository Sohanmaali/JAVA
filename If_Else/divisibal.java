import java.util.Scanner;
class Divisibal
{
public static void main(String[]args)                                  
{
	int num, num1;

  	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter First num");
	num = sc.nextInt();

	System.out.println("Enter Second num");
	num1 = sc.nextInt();

	if(num%num1==0)
	{
		System.out.println("Enter num is divisival by = "+num1);	
	}
	else
	{
		System.out.println("Enter num is Not divisival by = "+num1);	
	}
}
}