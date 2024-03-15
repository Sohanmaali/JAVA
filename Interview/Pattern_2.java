import java.util.Scanner;

public class Pattern_2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Row");
    int row = sc.nextInt();

    for (int i = 1; i <= row; i++) {
      int x = 1;
      for (int j = 1; j <= row + i - 1; j++) {
        if (j >= row - i + 1) {
          System.out.print(x + " ");
          x = j < row ? ++x : --x;
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }
}
