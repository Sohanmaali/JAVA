import java.util.Scanner;
class ProfitLoss
{
public static void main(String[]args)                                  
{
	int num1,num2;
  	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter purchesing amount");
  	 num1 = sc.nextInt();
	 System.out.println("Enter salling amount");
	 num2 = sc.nextInt();
	 
	if(num1>num2)
	{
		System.out.println("Loss " +(num1-num2)+"rs");
	}
	else if(num1<num2)
	{
		System.out.println("Profit " +(num2-num1)+"rs");
	}
	else
	{
		System.out.println("NO Profit no Loss");
	}
}
}