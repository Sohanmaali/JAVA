import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetSort {

  public static void main(String[] args) {
    TreeSet<Integer> ts = new TreeSet<Integer>(
      new Comparator() {
        @Override
        public int compare(Object o1, Object o2) {
          Integer i1 = (Integer) o1;
          Integer i2 = (Integer) o2;
          if (i1 > i2) return -1; else if (i1 < i2) return 1; else return 0;
        }
      }
    );
    ts.add(10);
    ts.add(50);
    ts.add(63);
    ts.add(41);
    ts.add(91);
    ts.add(3);
    System.out.println(ts);
  }
}
