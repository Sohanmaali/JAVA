//age criteriya ternary operator

import java.util.Scanner;
class EV
{
  public static void main(String[]args)                                  
  {
  	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any num");
  	int num = sc.nextInt();
	
 	String str= (num%2==0?"Evennum":"Odd num");
		
	System.out.println(str);
 }
  
}