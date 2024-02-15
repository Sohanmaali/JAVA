/*
1
3 5 
7 9 11
 */

import java.util.Scanner;

public class Pattern_57 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter any num");
          int row = sc.nextInt();
          int a = 1;
          for (int i = 1; i <= row; i++) {
               for (int j = 1; j <= i; j++) {
                    System.out.print(a + " ");
                    a += 2;
               }
               System.out.println("");
          }
          sc.close();
     }
}
