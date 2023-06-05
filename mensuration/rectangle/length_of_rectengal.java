
/*Lenth of rectangle*/

import java.lang.String;
import java.lang.System;
import java.util.Scanner;

class Length{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);

System.out.println("Enter perimeter of rectangle");
float p=sc.nextFloat(); 

System.out.println("Enter width of rectangle");
float w=sc.nextFloat();

float l=(p/2)-w;
System.out.println("length of rectangle" +l);

}

}