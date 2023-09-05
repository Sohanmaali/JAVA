import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any year");
        int n = sc.nextInt();

        if ((n % 100 != 0 && n % 4 == 0) || n % 400 == 0) {
            System.out.println("enter year is leap Year");
        } else {
            System.out.println("Normal year");
        }
        sc.close();
    }
}
