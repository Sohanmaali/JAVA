//Write a Java program to insert an element into the array list at the first position.

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.text.html.parser.Element;

public class Add_Element {

  public static void main(String[] args) {
    ArrayList<Integer> element = new ArrayList<Integer>(
      Arrays.asList(1, 5, 2, 6, 3, 4, 8, 9, 6, 10)
    );
    System.out.println("Before Adding Element");
    System.out.println(element);
    element.add(0, 100);
    System.out.println("\n\nAfter Adding Element");
    System.out.println(element);
  }
}
