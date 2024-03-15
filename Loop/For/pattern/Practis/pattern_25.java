/*
 1
 22
 333
 4444
 55555
 4444
 333
 22
 1

*/
import java.util.Scanner;

class Pattern_25 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any num");
    int row = sc.nextInt();
    int x = 1;

    for (int i = 1; i < (row << 1); i++) {
      for (int j = 1; j <= x; j++) {
        System.out.print(x + " ");
      }
      x = (i < row ? ++x : --x);
      System.out.println("");
    }
  }
}
