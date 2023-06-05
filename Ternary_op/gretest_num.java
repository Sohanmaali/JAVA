//Greatest of Two Numbers


import java.util.Scanner;
class Max
{
  public static void main(String[]args)                                  
  {
  	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any num");
  	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	
 	String str= (num1==num2?"both are equal":(num1>num2?"A is max":"B is max"));
		
	System.out.println(str);
 }
  
}