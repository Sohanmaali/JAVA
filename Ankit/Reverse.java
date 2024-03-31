public class Reverse {

  public static void main(String[] args) {
    int om = 0;
    int c = 786;
    for (; c > 0;) {
      int rem = c % 10;
      om = om * 10 + rem;
      c = c / 10;
    }
    System.out.println(om);
  }
}
