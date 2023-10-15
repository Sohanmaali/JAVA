import java.util.Scanner;

class Delete {
    public static void main(String[] args) {
        int arr[] = new int[100];
        int n = 5;
        int dell;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter arr elemrnt");

        for (int i = 0; i < n; arr[i] = sc.nextInt(), i++)
            ;
        System.out.println("enter delet elemrnt");
        dell = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] == dell) {
                for (int j = i; j < n - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                n--;
                i--;
                // break;
            }
        }
        System.out.println("");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}