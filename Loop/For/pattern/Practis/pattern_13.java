/*
54321
4321
321
21
1
*/
import java.util.Scanner;

class Pattern_13 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any num");
    int row = sc.nextInt();

    for (int i = 1; i <= row; i++) {
      int a = row - i + 1;
      for (int j = 1; j <= row - i + 1; j++) {
        System.out.print(a);
        a--;
      }
      System.out.println();
    }
  }
}
