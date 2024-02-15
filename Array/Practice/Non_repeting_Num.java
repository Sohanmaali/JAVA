import java.util.Scanner;

public class Non_repeting_Num {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter Size ");
          int size = sc.nextInt();
          int a[] = new int[100];
          System.out.println("Enter Array element");
          for (int i = 0; i < size; i++) {
               a[i] = sc.nextInt();
          }
          int flag;
          for (int i = 0; i < size; i++) {
               flag = 1;
               for (int j = i + 1; j < size; j++) {
                    if (a[i] == a[j]) {
                         flag++;
                         for (int k = j; k < size; k++) {
                              a[k] = a[k + 1];
                         }
                         size--;
                         j--;
                         break;
                    }
               }
               if (flag == 1) {
                    System.out.println("Element = " + a[i]);
                    break;
               }
          }
          sc.close();
     }
}
