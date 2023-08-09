
import java.util.Scanner;

public class Second_max {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];

        System.out.println("How many element you want to enter");
        int n = sc.nextInt();

        System.out.println("Enter element of array");

        for (int i = 0; i < n; a[i] = sc.nextInt(), i++);

        int max = a[0];
        for (int i = 0; i < n; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        int sec_max = a[0];
        for (int i = 0; i < n; i++) {
            if (sec_max > a[i] && a[i] < max) {
                sec_max = a[i];
            }
        }
        System.out.println("Second Maximum Element of array = "+sec_max);
    }
}
