import java.util.Scanner;

public class Unique_Element {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter Size ");
          int size = sc.nextInt();
          int a[] = new int[100];
          System.out.println("Enter Array element");
          for (int i = 0; i < size; i++) {
               a[i] = sc.nextInt();
          }
          System.out.println("Unique Element of Array");
          for (int i = 0; i < size; i++) {
               boolean f = false;
               int in = i;
               for (int j = i + 1; j < size; j++) {
                    if (a[i] == a[j]) {
                         in = j;
                         f = true;
                    }
               }
               if (!f) {
                    System.out.print(a[in] + " ");
               }
          }
          sc.close();
     }
}