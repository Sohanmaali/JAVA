import java.util.Scanner;
import java.lang.System;
import java.lang.String;
class Feren{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter temp in fahrenheit");
float f = sc.nextFloat();

float c =  ((f-32)*5)/9;
System.out.println("fahrenheit to celsius = "+c);
}
}
