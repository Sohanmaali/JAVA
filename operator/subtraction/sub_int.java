/*sub two integer*/

import java.util.Scanner;
import java.lang.System;
import java.lang.String;

class SubInt{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter First num");
int a = sc.nextInt();

System.out.println("Enter Second num");
int b = sc.nextInt();
int sub=a-b;
System.out.println("Sub = "+sub);
}
}
