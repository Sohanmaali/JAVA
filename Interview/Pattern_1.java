public class Pattern_1 {

  public static void main(String[] args) {
    for (int i = 1; i <= 5; i++) {
      int x = i;
      for (int j = 1; j <= 5; j++) {
        if (j >= 5 + 1 - i) {
          System.out.print(x + " ");
          x--;
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }
}
