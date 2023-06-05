/*DIV two Short value*/

import java.util.Scanner;
import java.lang.System;
import java.lang.String;
class DivShort
{
	public static void main(String[]args)
	{

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First num");
		short a = sc.nextShort();

		System.out.println("Enter Second num");
		short b = sc.nextShort();
		
		System.out.println("Sum = "+(a/b));
	}
}
