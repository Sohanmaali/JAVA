/*Radius of circel*/

import java.util.Scanner;
import java.lang.String;
import java.lang.System;
class Radius{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);

System.out.println("Enter Circumference of circle");
float c = sc.nextFloat();

float R=c/(2f*3.14f);

System.out.println("Radius  = "+R);
}

}
