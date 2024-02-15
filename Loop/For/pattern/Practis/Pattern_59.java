
/*
1
AB
123
ABCD
12345
 */
import java.util.Scanner;

public class Pattern_59 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter any num");
          int row = sc.nextInt();
          for (int i = 1; i <= row; i++) {
               char ch = 'A';
               for (int j = 1; j <= i; j++) {
                    if (i % 2 == 0) {
                         System.out.print(ch);
                         ch++;
                    } else
                         System.out.print(j);
               }
               System.out.println();
          }
     }
}
