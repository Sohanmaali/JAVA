/*SUbtraction two float num*/

import java.util.Scanner;
import java.lang.System;
import java.lang.String;

class SubFloat{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter First num");
float a = sc.nextFloat();

System.out.println("Enter Second num");
float b = sc.nextFloat();

float sub=a-b;
System.out.println("Sub = "+sub);
}
}
