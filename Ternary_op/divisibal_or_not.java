

//Check whether a number is divisible by 5 and 11 or not.



import java.util.Scanner;
class Divisibal
{
  public static void main(String[]args)                                  
  {
  	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any num");
  	int num1 = sc.nextInt();
	
 	String str= (num1%5==0&&num1%11==0?"Divisibal by 5 and 11":"Not divisible by 5 and 11");
		
	System.out.println(str);
 }
  
}