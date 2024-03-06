import java.util.Scanner;

class DeletDuplicate {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a[] = new int[20];

    System.out.println("How many element you want to enter");
    int n = sc.nextInt();

    System.out.println("Enter element of array");

    for (int i = 0; i < n; i++) a[i] = sc.nextInt();

    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (a[i] == a[j]) {
          for (int k = j; k < n - 1; k++) {
            a[k] = a[k + 1];
          }
          n--;
          j--;
        }
      }
    }
    System.out.println("New value of array");
    for (int i = 0; i < n; i++) {
      System.out.println(a[i] + " ");
    }
  }
}
