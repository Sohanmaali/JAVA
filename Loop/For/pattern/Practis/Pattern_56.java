import java.util.Scanner;

/*
**********
****  ****
***    ***
**      **
*        *
*/
public class Pattern_56 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter any num");
          int row = sc.nextInt();
          int a = 1;
          for (int i = 1; i <= row; i++) {
               for (int j = 1; j <= (row << 1); j++) {
                    if ((j <= row - i + 1) || (j >= row + a)) {
                         System.out.print("*");
                    } else
                         System.out.print(" ");
               }
               System.out.println("");
               a++;
          }
          sc.close();
     }
}
