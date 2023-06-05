//age criteriya ternary operator

import java.util.Scanner;
class NP
{
  public static void main(String[]args)                                  
  {
  	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any num");
  	int num = sc.nextInt();
	
 	String str= (num==0?"ZERO":(num<0?"Nagtive num":"Positive num"));
		
	System.out.println(str);
 }
  
}