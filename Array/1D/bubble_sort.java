import java.util.Scanner;

class BubbleSort {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a[] = new int[20];
    System.out.println("Enter size of array");
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      System.out.print("Enter " + (i + 1) + " Element of array : ");
      a[i] = sc.nextInt();
    }
    int temp;
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (a[j] > a[j + 1]) {
          temp = a[j];
          a[j] = a[j + 1];
          a[j + 1] = temp;
        }
      }
    }
    for (int i = 0; i < n; i++) {
      System.out.print(a[i] + " ");
    }
  }
}
