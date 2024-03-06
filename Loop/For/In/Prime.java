public class Prime {

  public static void main(String[] args) {
    int n = 2;
    if (n % 2 == 0) {
      System.out.println("not prime");
      return;
    }
    if (n <= 1) {
      System.out.println("not prime");
      return;
    }
    for (int i = 2; i <= n; i += 2) {
      if (n % i == 0) {
        System.out.println("not prime");
        return;
      }
    }
    System.out.println("prime");
  }
}
