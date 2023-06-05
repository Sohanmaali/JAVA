
/*Width of rectangle*/

import java.lang.String;
import java.lang.System;
import java.util.Scanner;

class Width{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);

System.out.println("Enter length of rectangle");
float l=sc.nextFloat(); 

System.out.println("Enter Area of rectangle");
float a=sc.nextFloat();

float w=a/l;
System.out.println("width of rectangle" +w);

}

}