/*Add two double num*/

import java.util.Scanner;
import java.lang.System;
import java.lang.String;

class AddDouble{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter First num");
double a = sc.nextDouble();

System.out.println("Enter Second num");
double b = sc.nextDouble();

double sum=a+b;
System.out.println("Sum = "+sum);
}
}
