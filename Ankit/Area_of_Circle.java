import java.util.Scanner;

public class Area_of_Circle {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Redias");
    float r = sc.nextInt();
    float ans = 3.14f * r * r;
    System.out.println("Ans = " + ans);
    sc.close();
  }
}
