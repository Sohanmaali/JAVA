/*
 *
 ***
 *****
 *******
 *********
 *******
 *****
 ***
 *
 */
import java.util.Scanner;

class Pattern_34 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any num");
    int row = sc.nextInt();
    int k = 1;
    for (int i = 1; i < (row << 1); i++) {
      for (int j = 1; j < row + i; j++) {
        if ((i <= row) && (j >= row - i + 1) || ((i >= row) && (j >= k && j <= (row << 1) - k))) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      k = (i >= row ? ++k : k);
      System.out.println("");
    }
  }
}
