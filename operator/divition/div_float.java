/* division of Float */

import java.util.Scanner;
import java.lang.System;
import java.lang.String;

class DivFloat{
public static void main(String[]args){

Scanner sc= new Scanner(System.in);

System.out.println("Enter first num");
float a=sc.nextFloat();

System.out.println("Enter second num");
float b=sc.nextFloat();

float div =a/b;
System.out.println("Division = "+div);
}
}

