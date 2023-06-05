import java.util.Scanner;
import java.lang.System;
import java.lang.String;
class Cels{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter temprature in celsius");
float c = sc.nextFloat();

double f = ( c* 9/5 ) + 32;
System.out.println("celsius to fahrenheit = "+f);
}
}
