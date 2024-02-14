
/*
*
* *
*  *
*   *
*    *
*     *
*      *
*       *
*        *
**********

 */

import java.util.Scanner;

public class Pattern_54 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter any num");
          int row = sc.nextInt();
          for (int i = 1; i < row << 1; i++) {
               for (int j = 1; j <= i; j++) {
                    if (j == i || (i == (row << 1) - 1 && j <= row) || j == 1) {
                         System.out.print("* ");
                    } else
                         System.out.print(" ");
               }
               System.out.println("");
          }
          sc.close();
     }
}
