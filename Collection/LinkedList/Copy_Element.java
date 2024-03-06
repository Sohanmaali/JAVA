//Write a Java program to copy a linked list to another linked list.
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Copy_Element {

  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>(
      Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    );

    LinkedList<Integer> list1 = new LinkedList<>();

    // Collections.copy(list, list1);// method not work

    list1.addAll(list);

    System.out.println(list1);
  }
}
