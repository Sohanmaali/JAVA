/*
     

A B C D E D C B A
  B C D E D C B
    C D E D C
      D E D
        E
*/
import java.util.Scanner;

class Pattern_24 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any num");
    int row = sc.nextInt();
    int a = 1;
    for (int i = 1; i <= row; i++) {
      char ch = 'A' - 1;
      for (int j = 1; j <= (row << 1) - i; j++) {
        ch = (j <= row ? ++ch : --ch);
        if (j >= i) {
          System.out.print(ch + " ");
        } else {
          System.out.print("  ");
        }
      }
      a++;
      System.out.println("");
    }
  }
}
