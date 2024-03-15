import java.util.Scanner;

public class Simple_intrest {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int p = sc.nextInt();
    int t = sc.nextInt();
    float r = sc.nextFloat();
    float in = (p * t * r) / 100;
    System.out.println(in);

    // (in * 100) / (t * r);
  }
}
