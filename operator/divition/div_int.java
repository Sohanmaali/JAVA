/* division of int */

import java.util.Scanner;
import java.lang.System;
import java.lang.String;

class DivInt
{
	public static void main(String[]args)
	{

		Scanner sc= new Scanner(System.in);

		System.out.println("Enter first num");
		int a=sc.nextInt();

		System.out.println("Enter second num");
		int b=sc.nextInt();

		int div =a/b;
		System.out.println("Division = "+div);
	}
}

