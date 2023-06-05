/* Modul of float */

import java.util.Scanner;
import java.lang.System;
import java.lang.String;

class ModFloat{
public static void main(String[]args){

Scanner sc= new Scanner(System.in);

System.out.println("Enter first num");
float a=sc.nextFloat();

System.out.println("Enter second num");
float b=sc.nextFloat();

float mod =a%b;
System.out.println("Modual = "+mod);
}
}

