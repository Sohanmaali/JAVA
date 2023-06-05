
//profit or loss.
// not complide

import java.util.Scanner;
class Alphabet
{
  public static void main(String[]args)
  {
  	Scanner sc = new Scanner(System.in);
	System.out.println("Enter purchesing price");
  	int pur = sc.nextInt();
	
	System.out.println("Enter Shelling price");
  	int shel = sc.nextInt();

 	String str= (pur>shel?"Loss":"profit");

	System.out.println(str);
 }