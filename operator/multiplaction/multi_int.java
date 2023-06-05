/*multiplaction of Int num*/

import java.lang.System;
import java.lang.String;
import java.util.Scanner;

class MultInt{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter First num");
int a=sc.nextInt();

System.out.println("Enter second num");
int b=sc.nextInt();

int mul =a*b;
System.out.println("Multiplaction = "+mul);
}
}