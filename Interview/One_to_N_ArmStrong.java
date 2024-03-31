public class One_to_N_ArmStrong {

  public static void main(String[] args) {
    int n = 10000;
    for (int i = 11; i <= n; i++) {
      int temp = i, c = 0, sum = 0;
      while (temp > 0) {
        temp /= 10;
        c++;
      }
      temp = i;
      while (temp > 0) {
        sum += (int) Math.pow(temp % 10, c);
        temp /= 10;
      }
      if (sum == i) System.out.print(i + " ");
    }
  }
}
