import java.util.Scanner;
class CheckNum
{
public static void main(String[]args)                                  
{
	int num1;
  	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter any num ");
  	 num1 = sc.nextInt();
	 
	if(num1>=0)
	{
		System.out.println("Positive num");
	}
	else 
	{
			System.out.println("Nagative num");
	}
}
}