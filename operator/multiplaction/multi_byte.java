/*Multiplaction two Byte value*/

import java.util.Scanner;
import java.lang.System;
import java.lang.String;
class MultiByte
{
	public static void main(String[]args)
	{

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First num");
		byte a = sc.nextByte();

		System.out.println("Enter Second num");
		byte b = sc.nextByte();
		
		System.out.println("Sum = "+(a*b));
	}
}
