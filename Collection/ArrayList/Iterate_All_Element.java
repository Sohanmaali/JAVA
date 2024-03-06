//Write a Java program to iterate through all elements in an array list.

import java.util.ArrayList;

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
      System.out.println(string);
    }
  }
}
