class Test {

  public void m() {
    System.out.println("Test Class");
  }
}

interface Inter {
  void m();
}

public class mohit extends Test implements Inter {

  public static void main(String[] args) {
    mohit m = new mohit();
    m.m();
  }
}
