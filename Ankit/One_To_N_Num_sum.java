import java.util.Scanner;

public class One_To_N_Num_sum {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    int a = 10;
    int sum = 0;
    for (int i = 1; i <= a; i++) {
      sum = sum + i;
    }
    System.out.println("1 to " + a + " sum = " + sum);
  }
}
