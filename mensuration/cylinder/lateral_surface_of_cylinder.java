/*lateral_surface_of_cylinder*/

import java.lang.String;
import java.lang.System;
import java.util.Scanner;
class Surface{
public static void main(String[]argd){

Scanner sc = new Scanner(System.in);

System.out.println("Enter radius of cylinder");
float r = sc.nextFloat();

System.out.println("Enter hight of cylinder");
float h = sc.nextFloat();

float v = 2*3.14f*r*h;
System.out.println("later surface of cylinder" +v);

}
}