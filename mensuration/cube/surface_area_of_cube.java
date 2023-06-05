/*Surface area of cube*/

import java.util.Scanner;
import java.lang.System;
import java.lang.String;
class SurfaceArea{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter Edge");
float a = sc.nextFloat();

float V= 6f*a*a;
System.out.println("Surface Area of cube = "+V);
}
}
