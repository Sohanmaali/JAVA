public class Print_even_Num {

  public static void main(String[] args) {
    int a = 20;
    for (int i = 1; i <= a; i++) {
      if (i % 2 == 0) {
        System.out.print(i + "  ");
      }
    }
  }
}
