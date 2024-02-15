import java.util.Scanner;

public class Frequency_of_num {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter Size ");
          int size = sc.nextInt();
          int a[] = new int[100];
          System.out.println("Enter Array element");
          for (int i = 0; i < size; i++) {
               a[i] = sc.nextInt();
          }
          System.out.println("Find Array element");
          int num = sc.nextInt();
          int freq = 0;
          for (int i = 0; i < size; i++) {

               if (a[i] == num) {
                    freq++;
               }
          }
          System.out.println("Frequency of " + num + " : " + freq);
          sc.close();
     }
}
