public class One_to_N_ArmStrong {

  public static void main(String[] args) {
    int n = 10000;
    for (int i = 10; i <= n; i++) {
      if (isArmstrong(i)) {
        System.out.print(i + "  ");
      }
    }
  }

  static boolean isArmstrong(int n) {
    int temp = n;
    int c = 0;
    while (n > 0) {
      n /= 10;
      c++;
    }
    n = temp;
    int sum = 0;

    while (n > 0) {
      sum += (int) Math.pow(n % 10, c);
      n /= 10;
    }
    if (sum == temp) return true; else return false;
  }
}
