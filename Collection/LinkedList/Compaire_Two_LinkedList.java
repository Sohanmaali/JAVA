//Write a Java program to compare two linked lists.
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Compaire_Two_LinkedList {

  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>(
      Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    );
    LinkedList<Integer> list1 = new LinkedList<>(
      Arrays.asList(1, 2, 3, 4, 5, 6, 25, 8, 9, 10)
    );
    if (list.size() != list1.size()) {
      System.out.println("Not Equal");
      return;
    }
    Collections.sort(list);
    Collections.sort(list1);
    for (int i = 0; i < list.size(); i++) {
      if (!list.get(i).equals(list1.get(i))) {
        System.out.println("not Equal");
        return;
      }
    }
    System.out.println("Equal");
  }
}
