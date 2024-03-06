//Write a Java program to insert elements into the linked list at the first and last positions.

import java.util.Arrays;
import java.util.LinkedList;

public class Add_Element_F_S {

  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<Integer>(
      Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    );

    list.addFirst(100);
    list.addLast(200);
    
    System.out.println(list);
  }
}
