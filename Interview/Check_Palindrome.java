public class Check_Palindrome {

  public static void main(String[] args) {
    int n = 130, sum = 0;
    int temp = n;
    while (temp > 0) {
      sum = sum * 10 + temp % 10;
      temp /= 10;
    }
    System.out.println(sum);
    if (n == sum) System.out.println("Palindromw"); else System.out.println(
      "Not palindrome"
    );
  }
}
