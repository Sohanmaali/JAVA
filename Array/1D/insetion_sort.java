import java.util.Scanner;

class InsetionSort {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a[] = new int[20];
    System.out.println("Enter size of array");
    int n = sc.nextInt();

    System.out.println("Enter Element of array : ");

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
      int min = a[i];
      for (int j = i; j > 0 && a[j - 1] > min; j--) {
        a[j] = a[j - 1];
        a[j - 1] = min;
      }
    }
    for (int i = 0; i < n; i++) {
      System.out.print(a[i] + " ");
    }
  }
}
