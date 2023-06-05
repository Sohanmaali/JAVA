/*Add two float num*/

import java.util.Scanner;
import java.lang.System;
import java.lang.String;
class AddFloat{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter First num");
float a = sc.nextFloat();

System.out.println("Enter Second num");
float b = sc.nextFloat();

float sum=a+b;
System.out.println("Sum = "+sum);
}
}
