/* * * * * * * * * *
     * * * * * * *
       * * * * *
         * * *
           *
         * * *
       * * * * *
     * * * * * * * 
   * * * * * * * * * 
  */

import java.util.Scanner;

public class pattern_52 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter Row Number");
          int row = sc.nextInt();
          int y = row - 1;
          int x = (row << 1) - 1;
          for (int i = 1; i < row << 1; i++) {
               for (int j = 1; j < row << 1; j++) {
                    if (((j >= i) && (j <= x)) || ((j > y) && j < x)) {
                         System.out.print("* ");
                    } else {
                         System.out.print("  ");
                    }
               }
               if (i < row) {
                    x--;
               } else {
                    y--;
                    x++;
               }
               System.out.println("");
          }
          sc.close();
     }
}
