
import java.util.Scanner;

public class Maximum {

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
        System.out.println("MAximum Element of array = "+max);
    }
}
