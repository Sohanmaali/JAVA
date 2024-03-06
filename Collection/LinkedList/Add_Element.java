import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Add_Element {

  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<Integer>(
      Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    );

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Element");
    int element = sc.nextInt();

    System.out.println("Enter Index");
    int index = sc.nextInt();

    // list.add(index, element);

    for (int i = list.size() - 1; i >= index; i--) {
      list.set(list.get(i), i + 1);
      if (i == index) {
        list.set(list.get(i), index); //loop not Work
        break;
      }
    }
    System.out.println(list);
  }
}
