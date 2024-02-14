import java.util.Scanner;

public class A {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter Row Number");
          int row;
          row = 5;
          int n= row-1;
          for (int i = 1; i <= row; i++) {
               for (int j = 1; j <= row << 1; j++) {
                    if (j==n||j==row+i||i==row/2+1)
                         System.out.print("*");
                    else
                         System.out.print("-");
               }
               System.out.println("");
               n--;
          }
          sc.close();
     }
}
/*  **    
   *  *
  ******
 *      *
*        *
*/