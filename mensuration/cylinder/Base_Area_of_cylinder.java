/*Base_Area_of_cylinder*/

import java.lang.String;
import java.lang.System;
import java.util.Scanner;
class Area{
public static void main(String[]argd){

Scanner sc = new Scanner(System.in);

System.out.println("Enter redius of cylinder");
float r = sc.nextFloat();

System.out.println("Enter volume of cylinder");
float v = sc.nextFloat();

float a = 3.14f*r*r;
System.out.println("Volume of cylinder" +a);

}
}