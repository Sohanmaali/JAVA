import java.lang.System;
import java.lang.String;
import java.util.Scanner;
class Perimeter{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter lenth of rectangle");
float l = sc.nextFloat();

System.out.println("Enter width of rectangle");
float w = sc.nextFloat();

float p=2*(l+w);
System.out.println("perimeter of rectangle "+p);
}}