//Write a Java program that swaps two elements in a linked list.
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Swap_Element {

  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<Integer>(
      Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    );

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter First Index");
    int first = sc.nextInt();

    System.out.println("Enter Second Index");
    int last = sc.nextInt();

    int temp = list.get(first);
    list.set(first, list.get(last));
    list.set(last, temp);
    System.out.println(list);
  }
}
