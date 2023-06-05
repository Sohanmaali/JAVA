/*multiplaction of Double*/

import java.lang.String;
import java.lang.System;
import java.util.Scanner;

class MultDouble{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);

System.out.println("Enter first num");
double a = sc.nextDouble();

System.out.println("Enter Second num");
double b = sc.nextDouble();

double mul = a*b;
System.out.println("multiplaction = "+mul);
}
}