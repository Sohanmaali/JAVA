//Write a Java program to check if a particular element exists in a linked list.

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Element_Exist {

  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>(
      Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    );
    int element = 15;
    
    for (Integer integer : list) {
      if (integer == element) {
        System.out.println("Element Present");
        return;
      }
    }
    System.out.println("Element Not Present");
  }
}
