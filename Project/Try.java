import java.util.InputMismatchException;
import java.util.Scanner;

class Try {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        int choice = 0;
        do {
            try {
                flag = false;
                choice = sc.nextInt();

            } catch (InputMismatchException e) {
                flag = true;
                System.out.println("Invalid Input Please Enter Your choice in int ");
            }
            sc.nextLine();
        } while (flag);
        switch (choice) {
            case 1 -> {
                System.out.println("Hello");

                break;
            }

        }
    }
}