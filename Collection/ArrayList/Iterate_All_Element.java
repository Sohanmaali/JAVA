//Write a Java program to iterate through all elements in an array list.

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

public class Iterate_All_Element {

  public static void main(String[] args) {
    ArrayList<String> colors = new ArrayList<String>();
    colors.add("red");
    colors.add("Green");
    colors.add("Blue");
    colors.add("Pink");
    colors.add("White");
    colors.add("Black");

    for (String string : colors) {
      System.out.print(string + "  ");
    }

    System.out.println("\n\nUsing itrater");
    Iterator it = colors.iterator();
    while (it.hasNext()) {
      System.out.print(it.next() + "  ");
    }

    System.out.println("\n\nUsing Listitrater");
    ListIterator li = colors.listIterator();

    while (li.hasNext()) {
      String i = (String) li.next();
      if (i.equals("White")) {
        li.remove();
        li.previous();
      }
      System.out.print(i + "  ");
    }
    System.out.println("\n\n" + colors);
  }
}
