
/* * * * * * * * * *
     *           *
       *       *
         *   *
           *
         *   *
       *       *
     *           * 
   * * * * * * * * * 
  */
import java.util.Scanner;

public class pattern_85 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter Row Number");
          int row = sc.nextInt();
          int x = row << 1;
          for (int i = 1; i < row << 1; i++) {
               for (int j = 1; j < x; j++) {
                    if (j == i || j == (row << 1) - i || i == 1 || i == (row << 1) - 1) {
                         System.out.print("* ");
                    } else {
                         System.out.print("  ");
                    }
               }
               if (i < row) {
                    x--;
               } else
                    x++;

               System.out.println("");
          }
          sc.close();
     }
}