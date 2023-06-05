import java.lang.String;
import java.lang.System;
import java.util.Scanner;
class BaseArea{
public static void main(String[]ar){

Scanner sc = new Scanner(System.in);

System.out.println("Enter radius of cone");
float r = sc.nextFloat();

float a=3.14f*(r*r);

System.out.println("Base area of cone "+a);
}
}