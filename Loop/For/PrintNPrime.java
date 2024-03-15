import java.util.Scanner;

class PrintNPrime {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Starting number ");
    int i = sc.nextInt();

    System.out.println("Enter number of prime number ");
    int num = sc.nextInt();

    int digit = 0;

    System.out.println(isPrime(13));
    //   for (;; i++) {
    //     if (isPrime(i)) {
    //       System.out.print(i + " ");
    //       digit++;
    //     }
    //     if (digit == num) {
    //       break;
    //     }
    //   }
  }

  static boolean isPrime(int n) {
    if (n < 2) {
      return false;
    }
    if (n == 2 || n == 3) {
      return true;
    }
    if (n % 2 == 0) {
      return false;
    }
    for (int i = 3; i < n / 2; i += 2) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
}
