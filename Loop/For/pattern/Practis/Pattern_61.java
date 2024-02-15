
/*
1 2 3 4 5
2 3 4 5
3 4 5
4 5
5
 */
import java.util.Scanner;;

public class Pattern_61 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter any num");
          int row = sc.nextInt();
          for (int i = 1; i <= row; i++) {
               int x = i;
               for (int j = 1; j <= row - i + 1; j++) {
                    System.out.print(x++ + " ");
               }
               System.out.println();
          }
     }
}
