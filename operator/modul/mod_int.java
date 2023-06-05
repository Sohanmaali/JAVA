/* Modul of int */

import java.util.Scanner;
import java.lang.System;
import java.lang.String;

class ModInt{
public static void main(String[]args){

Scanner sc= new Scanner(System.in);

System.out.println("Enter first num");
int a=sc.nextInt();

System.out.println("Enter second num");
int b=sc.nextInt();

int mod =a%b;
System.out.println("Modual = "+mod);
}
}

