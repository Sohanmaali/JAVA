import java.util.ArrayList;

public class ArrayList_Test {

  public static void main(String[] args) {
    ArrayList a = new ArrayList();
    a.add(10);
    a.add("sohan");
    a.add(10.5);
    a.add(10.5f);
    System.out.println(a);
    a.remove(2);
    System.out.println(a);
    System.out.println();
  }
}
