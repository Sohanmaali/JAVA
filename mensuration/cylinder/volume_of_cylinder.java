/*volume_of_cylinder*/

import java.lang.String;
import java.lang.System;
import java.util.Scanner;
class Volume{
public static void main(String[]argd){

Scanner sc = new Scanner(System.in);

System.out.println("Enter redius of cylinder");
float r = sc.nextFloat();

System.out.println("Enter hight of cylinder");
float h = sc.nextFloat();

float v = 3.14f*(r*r)*h;
System.out.println("Volume of cylinder" +v);

}
}