//bainari_to_decimal
import java.util.Scanner;

class Decimal {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any num");
    int n = sc.nextInt();
    int decimal = 0;
    int i, j;
    for (j = 0; n > 0; n /= 10, j++) {
      int rem = n % 10;
      int power = 1;
      for (i = 1; i <= j; i++) {
        power *= 2;
      }
      decimal = decimal + power * rem;
    }
    System.out.println("decimal Number = " + decimal);
  }
}
