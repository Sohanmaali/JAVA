import java.util.Scanner;
import java.lang.System;
import java.lang.String;
class Volume{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter mass");
float m = sc.nextFloat();

System.out.println("Enter volume");
float v = sc.nextFloat();

double p=m/v;
System.out.println("Area of cube = "+p);
}
}
