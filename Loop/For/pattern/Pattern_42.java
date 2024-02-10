//1
//2 6
//3 7 10
//4 8 11 13
//5 9 12 14 15
import java.util.Scanner;
public class pattern_42 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter any num");
          int row = sc.nextInt();

          for (int i = 1; i <= row; i++) {
               int x = i;
               int y = row - 1;
               for (int j = 1; j <= i; j++) {
                    System.out.print(x + " ");
                    x = x + y;
                    y--;
               }
               System.out.println("");
          }

     }
}
