import java.util.Scanner;

public class SelectionShort {
    public static void main(String[] args) {

        int arr[] = new int[100];
        int n = 5;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter arr elemrnt");

        for (int i = 0; i < n; arr[i] = sc.nextInt(), i++) ;

        int pos, min;
        for (int i = 0; i < n; i++) {
            min = arr[i];
            pos = i;
            for (int j = i + 1; j < n; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    pos = j;
                }
            }
            arr[pos] = arr[i];
            arr[i] = min;
        }
        
        System.out.println("after");
        for (int i = 0; i < n; System.out.print(arr[i] + " "), i++)
            ;
        sc.close();
    }
}
