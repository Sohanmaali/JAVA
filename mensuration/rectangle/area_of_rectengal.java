import java.util.Scanner;
import java.lang.String;
import java.lang.System;
class AreaOfRectengal{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);

System.out.println("Enter Lenth of rectengal");
float l = sc.nextFloat();

System.out.println("Enter with of rectengal");
float w = sc.nextFloat();

float A=l*w;

System.out.println("Adition = "+A);
sc.close();
}

}
