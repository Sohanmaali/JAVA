import java.util.*;

class Array {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter  array length");
		int n = sc.nextInt();
		System.out.println("enter array elements");
		int a[] = new int[10];
		int i, j;
		System.out.println("actual Array elements are");
		for (i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (i = 0; i < n; i++) {
			System.out.println("\ta[" + i + "]=" + a[i] + "\n");
		}
		for (i = 0; i < n; i++) {
			for (j = i + 1; j < n;) {
				if (a[j] == a[i]) {
					a[j] = a[i];
					for (int k = j; k < n; k++) {
						a[k] = a[k + 1];
					}
					n--;
				} else {
					j++;
				}
			}
		}
		System.out.println("after delete repeated element new array element is:");
		for (i = 0; i < n; i++) {
			System.out.println("\ta[" + i + "]=" + a[i] + "\n");
		}

	}
}