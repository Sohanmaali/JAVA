
@FunctionalInterface
interface A {
    // void m(double n);
    int x = 999;

    void m(int n);

    private static void m2() {
        System.out.println("static");
    }

}

interface B {
    int x = 888;
    // void m(float x);
}

class Test implements A, B {
    // int add(int a,int b);
    public void m(int c) {
        System.out.println("int");
    }

    public void m(float c) {
        System.out.println("float");

    }

    public static void main(String[] args) {
        // System.out.println("hello");
        Test d = new Test();
        // d.m(10);
        // d.m(10);
        // System.out.println(d.x);
        // System.out.println(A.x);
        // System.out.println(B.x);
        A.m2();
    }
}
