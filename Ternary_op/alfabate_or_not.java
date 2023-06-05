

//Check whether a character is an alphabet or not.

import java.util.Scanner;
class Alphabet
{
  public static void main(String[]args)
  {
  	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any num");
  	char stri = sc.next().charAt(0);

 	String str= ((stri>=65&&stri<=90)||(stri>=97&&stri<=122)?"Alfabate":"Not Alfabate");

	System.out.println(str);
 }

}