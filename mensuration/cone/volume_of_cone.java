/*volume_of_cone*/

import java.lang.System;
import java.lang.String;

import java.util.Scanner;
class Volume{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter redius of circular base");
float r = sc.nextFloat();


System.out.println("Enter hight of circular cone");
float h = sc.nextFloat();
float v = 3.14f*r*r*(h/3);

System.out.println("Volume of cone = "+v);
}
}