/*sub two long*/

import java.util.Scanner;
import java.lang.System;
import java.lang.String;

class SubLong{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter First num");
long a = sc.nextLong();

System.out.println("Enter Second num");
long b = sc.nextLong();

long sub=a-b;
System.out.println("Sub = "+sub);
}
}
