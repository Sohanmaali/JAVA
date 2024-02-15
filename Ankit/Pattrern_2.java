// 1
// 22
// 333
// 4444
// 5555

import java.util.Scanner;

public class Pattrern_2 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter Row num");
          int row = sc.nextInt();

          for (int a = 1; a <= row; a++) {
               for (int s = 1; s <= a; s++) {
                    System.out.print("# ");
               }
               System.out.println("");
          }


















          sc.close();
     }
}
