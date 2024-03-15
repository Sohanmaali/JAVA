public class Check_Armstrong {

  public static void main(String[] args) {
    int n = 1640;
    int temp = n, sum = 0;
    int c = 0;
    while (n > 0) {
      c++;
      n /= 10;
    }
    n = temp;
    while (n > 0) {
      sum += (int) Math.pow(n % 10, c);
      n /= 10;
    }
    if (sum == temp) System.out.println("Armstrong"); else System.out.println(
      "Not Armstrong"
    );
  }
}
