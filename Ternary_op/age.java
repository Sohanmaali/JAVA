//age criteriya ternary operator

import java.util.Scanner;
class Age
{
  public static void main(String[]args)                                  
  {
  	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Your age");
  	int age = sc.nextInt();
	
 	String str= (age<=0?"Invalide Age":(age<12?"Childe":(age<19?"Teen":(age<55?"Yang":"old"))));
		
	System.out.println(str);
 }
  
}