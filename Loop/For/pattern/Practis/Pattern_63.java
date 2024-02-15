
/*
*
**
***
****
***
**
*
 */

import java.util.Scanner;

public class Pattern_63 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter Any Odd Number");
          int row = sc.nextInt();
          int x = 1;
          for (int i = 1; i < row << 1; i++) {
               for (int j = 1; j <= x; j++) {
                    System.out.print("*");
               }
               if (i < row) {
                    x++;
               } else
                    x--;
               System.out.println();
          }
          sc.close();
     }
}
