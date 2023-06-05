/*Subtraction two double num*/

import java.util.Scanner;
import java.lang.System;
import java.lang.String;

class SubDouble{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter First num");
double a = sc.nextDouble();

System.out.println("Enter Second num");
double b = sc.nextDouble();

double sub=a-b;
System.out.println("Sub = "+sub);
}
}
