public class Prime_Check {

  public static void main(String[] args) {
    int n = 7;
    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        System.out.println(n + "    is Not Prime number");
        // break;
        return;
      }
    }
    System.out.println("Prime Number");
  }
}
