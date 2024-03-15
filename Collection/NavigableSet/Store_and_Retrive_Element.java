import java.util.NavigableSet;
import java.util.TreeSet;

public class Store_and_Retrive_Element {

  public static void main(String[] args) {
    NavigableSet ns = new TreeSet();
    ns.add(1000);
    ns.add(2000);
    ns.add(3000);
    ns.add(4000);
    ns.add(5000);
    ns.add(6000);
    ns.add(7000);
    ns.add(8000);
    ns.add(9000);
    ns.add(10000);
    // System.out.println(ns.ceiling(2500));
    // System.out.println(ns.higher(4900));
    // System.out.println(ns.floor(3000));
    // System.out.println(ns.pollFirst());
    System.out.println(ns.pollLast());

    System.out.println(ns);
  }
}
