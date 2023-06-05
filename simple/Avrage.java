import java.util.Scanner;
import java.lang.System;
import java.lang.String;
class Avrage{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter 1st Num");
int n1 = sc.nextInt();

System.out.println("Enter 2nd Num");
int n2 = sc.nextInt();

System.out.println("Enter 3rd Num");
int n3 = sc.nextInt();

System.out.println("Enter 4th Num");
int n4 = sc.nextInt();

System.out.println("Enter 5th Num");
int n5 = sc.nextInt();

System.out.println("Enter 6th Num");
int n6 = sc.nextInt();

System.out.println("Enter 7th Num");
int n7 = sc.nextInt();


int avr= (n1+n2+n3+n4+n5+n6+n7)/7;

System.out.println("Avrage of seven num = "+avr);
}
}
