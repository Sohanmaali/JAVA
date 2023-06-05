/* division of long */

import java.util.Scanner;
import java.lang.System;
import java.lang.String;

class DivLong{
public static void main(String[]args){

Scanner sc= new Scanner(System.in);

System.out.println("Enter first num");
long a=sc.nextLong();

System.out.println("Enter second num");
long b=sc.nextLong();

long div =a/b;
System.out.println("Division = "+div);
}
}

