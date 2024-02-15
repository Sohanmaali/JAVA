import java.util.Scanner;

public class Search_Element {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter Size ");
          int size = sc.nextInt();
          int a[] = new int[100];
          System.out.println("Enter Array element");
          for (int i = 0; i < size; i++) {
               a[i] = sc.nextInt();
          }
          System.out.println("Enter Search element");
          int num = sc.nextInt();
          boolean flag = false;
          for (int i = 0; i < size; i++) {
               if (a[i] == num) {
                    System.out.println("Element Found at index num = " + i);
                    flag = true;
                    break;
               }
          }
          if (!flag) {
               System.out.println("Element Not Found");
          }
     }
}
