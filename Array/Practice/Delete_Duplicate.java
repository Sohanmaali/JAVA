import java.util.Scanner;

public class Delete_Duplicate {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter Size ");
          int size = sc.nextInt();
          int a[] = new int[100];
          System.out.println("Enter Array element");
          for (int i = 0; i < size; i++) {
               a[i] = sc.nextInt();
          }
          System.out.println("Before Delete_Duplicate");
          for (int i = 0; i < size; i++) {
               System.out.print(a[i] + " ");
          }
          for (int i = 0; i < size; i++) {
               for (int j = i + 1; j < size; j++) {
                    if (a[i] == a[j]) {
                         for (int k = j; k < size; k++) {
                              a[k] = a[k + 1];
                         }
                         j--;
                         size--;
                    }
               }
          }
          System.out.println("\nAfter Delete_Duplicate");
          for (int i = 0; i < size; i++) {
               System.out.print(a[i] + " ");
          }
          sc.close();
     }
}
