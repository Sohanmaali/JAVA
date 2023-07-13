
import java.util.Scanner;


public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any num ");
        int n = sc.nextInt();
        int i,fact;
        for(i = 1,fact = 1;i<=n;fact*=i,i++);
        System.out.println("Factorial = "+fact);
    }
}
