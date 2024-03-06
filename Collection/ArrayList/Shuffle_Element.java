//Write a Java program to shuffle elements in an array list.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Shuffle_Element {

  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<Integer>(
      Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    );
    Collections.shuffle(arr);
    System.out.println(arr);
  }
}
