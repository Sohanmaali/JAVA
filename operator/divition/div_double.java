/* division of Double */

import java.util.Scanner;
import java.lang.System;
import java.lang.String;

class DivDouble{
public static void main(String[]args){

Scanner sc= new Scanner(System.in);

System.out.println("Enter first num");
Double a=sc.nextDouble();

System.out.println("Enter second num");
Double b=sc.nextDouble();

Double div =a/b;
System.out.println("Division = "+div);
}
}

