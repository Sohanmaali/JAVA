import java.util.Scanner;
import java.lang.String;
import java.lang.System;
class DiagonalOfRectangle{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);

System.out.println("Enter lenth of Rectangle");
float l = sc.nextFloat();

System.out.println("Enter with of Rectangle");
float w=sc.nextFloat();
double temp=(w+l);
double D=(temp+((w+l)/temp))/2;

System.out.println("Diagonal = "+D);
}

}
