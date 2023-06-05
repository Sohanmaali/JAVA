/*Volume of cube*/

import java.util.Scanner;
import java.lang.System;
import java.lang.String;
class Volume{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter Edge");
float a = sc.nextFloat();

double V= a*a*a;
System.out.println("Area of cube = "+V);
}
}
