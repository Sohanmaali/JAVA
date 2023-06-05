/*Add two integer*/

import java.util.Scanner;
import java.lang.System;
import java.lang.String;
class AddInt{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter First num");
int a = sc.nextInt();

System.out.println("Enter Second num");
int b = sc.nextInt();
int sum=a+b;
System.out.println("Sum = "+sum);
}
}
