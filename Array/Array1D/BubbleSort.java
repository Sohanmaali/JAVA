import java.util.Scanner;

class Array {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Array length:");
    int n = sc.nextInt();
    int a[] = new int[10];
    System.out.print("Enter the element ");
    int i, j, temp = 0;
    for (i = 0; i < n; i++) a[i] = sc.nextInt();
    for (i = 0; i < n; i++) {
      for (j = 0; j < n - 1; j++) {
        if (a[j] > a[j + 1]) {
          temp = a[j + 1];
          a[j + 1] = a[j];
          a[j] = temp;
        }
      }
    }
    System.out.println("After swaping");
    for (i = 0; i < n; i++) {
      System.out.println(a[i]);
    }
  }
}
