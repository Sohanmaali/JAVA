/*
12345
1234
123
12
1
*/
import java.util.Scanner;

class Pattern_15 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any num");
    int row = sc.nextInt();

    for (int i = 1; i <= row; i++) {
      for (int j = 1; j <= row - i + 1; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
  }
}
