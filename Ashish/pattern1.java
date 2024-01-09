class Pattern {

  public static void main(String[] args) {
    // int n = 5;
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= n; j++) {
    // if (j >= n + 1 - i) {
    // System.out.print(i + " ");
    // } else {
    // System.out.print(" ");
    // }
    // }
    // System.out.println("");
    // }

    int row = 5;

    for (int i = 1; i <= row; i++) {
      // char ch =
      int x = 'A' - 1;
      for (int j = 1; j <= (row << 1) - 1; j++) {
        if (j > row - i && j <= row - 1 + i) {
          System.out.print(x + " ");
          x = (j < row ? ++x : --x);
        } else {
          System.out.print("  ");
        }
      }
      System.out.println("");
    }
  }
}
