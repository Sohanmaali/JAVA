class A extends Thread {
    // public void run() {
    // for (int i = 1; i <= 5; i++) {
    // System.out.println(getName() + " " + i);
    // }
    // }
    public void display() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " " + i);
        }

    }
}

class B {
    public static void main(String[] args) {
        A a = new A();
        A b = new A();
        A c = new A();
        a.display();
        b.display();
        c.display();
    }
}