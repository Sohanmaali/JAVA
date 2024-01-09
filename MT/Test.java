public class Test {
     public static void main(String[] args) {
          B b = new B();
          b.m1();
     }
}

/**
 * A
 */
class A {
     public void m1() {
          System.out.println("i am m1 of A");
     }

}

class B extends A {
     public void m1() {
          System.out.println("i am m1 of b");
     }

     public void m2() {
          System.out.println("i am m2 of B");
     }
}