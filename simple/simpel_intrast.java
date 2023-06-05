import java.util.Scanner;
import java.lang.System;
import java.lang.String;

class Intrast{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter principal");
float p = sc.nextFloat();

System.out.println("Enter rate");
float r = sc.nextInt();

System.out.println("Enter Time");
float t = sc.nextFloat();

float A=(p*r*t)/100;

System.out.println("Simpel Entrast = "+A);
}
}
