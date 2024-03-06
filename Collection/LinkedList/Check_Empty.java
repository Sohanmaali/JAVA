//Write a Java program to check if a linked list is empty or not.
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Check_Empty {

  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>(
      Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    );
    if (list.size() == 0) {
      System.out.println("List is Empty");
      return;
    }
    System.out.println("List is Not Empty");
  }
}
