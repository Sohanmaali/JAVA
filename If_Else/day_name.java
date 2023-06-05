import java.util.Scanner;
class DayName
{
public static void main(String[]args)                                  
{
	int num;
  	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter A num 1-7");
  	 num = sc.nextInt();
	 
	if(num==1)
	{
		System.out.println("MONDAY");
	}
    else if(num==2)
	{
		System.out.println("TUESDAY");
	}
	else if (num==3)
	{
		System.out.println("WEDNSDAY");
	}
	else if(num==4)
	{
		System.out.println("THRSADAY");
	}
	else if(num==5)
	{
		System.out.println("FRIDAY");
	}
	else if(num==6)
	{
		System.out.println("SATARDAY");
	}
	else if(num==7)
	{
		System.out.println("SUNDAY");
	}		
    else
	{
		System.out.println("INVALIDE INPUT !");
	}								
}
}
