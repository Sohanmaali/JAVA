public class Fibbonaci {

  public static void main(String[] args) {
    int a = -1, b = 1, sum = 0;
    for (int i = 1; i < 6; i++) {
      sum = a + b;
      System.out.print(sum + "  ");
      a = b;
      b = sum;
    }
  }
}
