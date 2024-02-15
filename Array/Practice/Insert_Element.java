import java.util.Scanner;

public class Insert_Element {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter Size ");
          int size = sc.nextInt();
          int a[] = new int[100];
          System.out.println("Enter Array element");
          for (int i = 0; i < size; i++) {
               a[i] = sc.nextInt();
          }
          System.out.println("Enter Array element");
          int num = sc.nextInt();
          System.out.println("Enter Array Index");
          int index = sc.nextInt();
          int x = 0;
          for (int i = size; i >= index; i--) {

               if (i == index) {
                    a[index] = num;
                    size++;
                    break;
               }

               a[i] = a[size - x - 1];
               x++;
          }
          System.out.println("After Element Insert");
          for (int i = 0; i < size; i++) {
               System.out.print(a[i] + " ");
          }
     }
}
