public class One_to_N_Prime {

  public static void main(String[] args) {
    int n = 100;
    for (int i = 1; i <= n; i++) {
      if (isPrime(i)) System.out.print(i + "  ");
    }
  }

  static boolean isPrime(int n) {
    if (n < 2) return false;
    if (n == 2 || n == 3) return true;
    if (n % 2 == 0) return false;
    for (int i = 3; i < n; i += 2) {
      if (n % i == 0) return false;
    }
    return true;
  }
}
