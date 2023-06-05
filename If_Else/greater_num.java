import java.util.Scanner;
class Greater
{
public static void main(String[]args)                                  
{
	int num1,num2;
  	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter any two num ");
  	 num1 = sc.nextInt();
	 num2 = sc.nextInt();
	if(num1>num2)
	{
		System.out.println("Greater num = "+num1);
	}
	else if(num2>num1)
	{
	     System.out.println("Greater num = "+num2);	
	}
	else 
	{
	     System.out.println("Both are equal");	
	}
}
}