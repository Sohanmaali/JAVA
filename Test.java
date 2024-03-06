import java.util.Scanner;

public class Test {
     // int i = 100;

     // public static void main(String[] args) {
     // int i = 10;
     // System.out.println(i);
     // System.out.println(new Test().i);
     // }

     // void m() {
     // int i = 10;
     // }
     // public static void main(String... args) {
     // System.out.println("Enter any num");
     // Scanner sc = new java.util.Scanner(System.in);
     // int i = sc.nextInt(), n = sc.nextInt();
     // for (; i <= n;) {
     // System.out.println(i);
     // i++;
     // }
     // // String s =(String) new Object();
     // // System.out.println(s);
     // sc.close();
     // }

     public static void main(String[] args) {
          System.out.println("Enter any num");
          Scanner sc = new java.util.Scanner(System.in);
          int i = sc.nextInt();
          switch (i) {
               case 10:
                    System.out.println("10");
                    break;
               case 20:

                    System.out.println("20");
                    break;

               default:
                    break;
          }
          sc.close();
     }
}