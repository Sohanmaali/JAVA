import java.util.Scanner;

public class Reverse {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter Size ");
          int size = sc.nextInt();
          int a[] = new int[100];
          System.out.println("Enter Array element");
          for (int i = 0; i < size; i++) {
               a[i] = sc.nextInt();
          }
          System.out.println("Reverse of Array");
          for (int i = 0; i < size / 2; i++) {
               int t = a[size - i - 1];
               a[size - i - 1] = a[i];
               a[i] = t;
          }
          for (int i = 0; i < size; i++) {
               System.out.print(a[i] + " ");
          }
     }
}
