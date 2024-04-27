public class Palindrome {

  public static void main(String[] args) {
    int n = 125;
    int p = 0;
    int a = n;
    while (n > 0) {
      int rem = n % 10;
      p = p * 10 + rem;
      n = n / 10;
      System.out.println(" rem = " + rem + "\n p = " + p + "\n n = " + n);
    }
    if (p == a) {
      System.out.println("Palindrome number");
    } else {
      System.out.println("Not Palindrome number");
    }
  }
}
