/*surface_area_of_cylinder*/


import java.util.Scanner;
import java.lang.System;
import java.lang.String;
class Area{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter redias of Cylinder");

float r = sc.nextFloat();

System.out.println("Enter High of Cylinder");

float h = sc.nextFloat();

float a =(2*3.14f*r*h)+(2*3.14f*r*r);

System.out.println("Surface Area of Cylinder = "+a);
}
}
