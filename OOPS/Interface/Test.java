interface Demo {
    int i = 520;
}

class Test implements Demo {
    // int add(int a,int b);
    public static void main(String[] args) {
        System.out.println("hello");
        Demo d = new Test();
        System.out.println(Demo.i);
        // Demo.m();
    }
}
