// package inheri;

interface InnerTest {
     // void m();
}

class Demo {
     static void m() {
          System.out.println("Demo");
     }
}
// interface InnerTest2 {
// void m();
// }

// public class Test implements InnerTest, InnerTest2, InnerTest3 {
// public void m() {
// System.out.println("Hello");
// }

// public int m() {
// System.out.println("Hello");
// return 520;
// }

// public static void main(String[] args) {
// Test it = new Test();
// it.m();
// System.out.println();
// }
// }
class Test extends Demo // implements InnerTest
{
     static public void m() {
          System.out.println("Test");
     }

     public static void main(String[] args) {
          Test t = new Test();
          t.m();
     }
}
