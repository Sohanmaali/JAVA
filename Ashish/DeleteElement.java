class Delete {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 1, };
        int n = arr.length;
        int dell = 1;
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
    }
}