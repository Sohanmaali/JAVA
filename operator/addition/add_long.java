/*Add two long num*/

import java.util.Scanner;
import java.lang.System;
import java.lang.String;
class AddLong{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter First num");
long a = sc.nextLong();

System.out.println("Enter Second num");
long b = sc.nextLong();

float sum=a+b;
System.out.println("Sum = "+sum);
}
}
