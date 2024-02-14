
/*
555555555
544444445
543333345
543222345
543212345
543222345
543333345
544444445
555555555
 */

import java.util.Scanner;

public class Pattern_53 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter any num");
          int N = sc.nextInt();

          for (int i = N; i >= 1; i--) {
               for (int j = N; j >= i; j--)
                    System.out.print(j + " ");
               for (int j = 1; j <= 2 * i - 3; j++)
                    System.out.print(i + " ");
               for (int j = i; j <= N; j++) {
                    if (j == 1)
                         continue;
                    System.out.print(j + " ");
               }
               System.out.println();
          }
          for (int i = 2; i <= N; i++) {
               for (int j = N; j >= i; j--)
                    System.out.print(j + " ");
               for (int j = 1; j <= 2 * i - 3; j++)
                    System.out.print(i + " ");
               for (int j = i; j <= N; j++)
                    System.out.print(j + " ");
               System.out.println();
          }

          sc.close();
     }
}
