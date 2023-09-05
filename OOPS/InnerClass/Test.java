
/*
 * class Test {
 * 
 * private int data = 30;
 * 
 * lass Inner {
 * 
 * void msg() {
 * System.out.println("data is " + data);
 * }
 * }
 * }
 * 
 * class Main {
 * public static void main(String args[]) {
 * 
 * // Test obj=new Test();
 * Test.Inner in = new Test().new Inner();
 * in.msg();
 * }
 * }
 */

// method inner class
/*
 * class Test {
 * private int data = 30;
 * 
 * void displayData() {
 * 
 * class Inner {
 * 
 * void msg() {
 * System.out.println("data is " + data);
 * }
 * }
 * Inner inner = new Inner();
 * inner.msg();
 * }
 * }
 * 
 * class Main {
 * public static void main(String[] args) {
 * Test test = new Test();
 * test.displayData();
 * }
 * }
 */
/*
 * class Test {
 * 
 * int data = 30;
 * 
 * abstract class Inner {
 * abstract void msg();
 * }
 * 
 * class X // extends Test.Inner
 * {
 * public void msg() {
 * System.out.println("i am inner X class");
 * }
 * }
 * }
 * 
 * class Sohan extends Test.Inner {
 * 
 * public void msg() {
 * System.out.println("i am inner  frome sohan class");
 * }
 * }
 * 
 * class Main {
 * public static void main(String[] args) {
 * Test test = new Test();
 * 
 * Sohan so = new Sohan();
 * 
 * Test.X in = test.new X();
 * in.msg();
 * so.msg();
 * }
 * }
 */
/*
 * abstract class Test {
 * abstract void msg();
 * }
 * 
 * class Main {
 * 
 * public static void main(String[] args)
 * {
 * 
 * Test test = new Test(){
 * void msg()
 * {
 * System.out.println("i am inner class");
 * }
 * };
 * Test test1 = new Test(){
 * void msg()
 * {
 * System.out.println("i am outer class");
 * }
 * };m,
 * test.msg();
 * test1.msg();
 * }
 * }
 */
/*
 * class Main {
 * void show()
 * {
 * class Local
 * {
 * private void msg()
 * {
 * System.out.println("sohan");
 * }
 * }
 * Local ob1 = new Local();
 * ob1.msg();
 * }
 * }
 * class Test{
 * public static void main(String[] args)
 * {
 * Main ob = new Main();
 * 
 * ob.show();
 * }
 * }
 */

/*
 * interface Show{
 * void show();
 * interface Inner{
 * void m1();
 * default void m2()
 * {
 * System.out.println("i am m2 ");
 * }
 * }
 * }
 * class Main implements Show, Show.Inner{
 * public void m1()
 * {
 * System.out.println("i am m1 ");
 * }
 * public void show ()
 * {
 * System.out.println("i am Show ");
 * }
 * public static void main(String[] args)
 * {
 * Show.Inner ob = new Main ();
 * //Main ob1 = new Main();
 * ob.m1();
 * ob.m2();
 * }
 * }
 */

/*
 * class Test {
 * static int a = 0;
 * public Test ()
 * {
 * a++;
 * }
 * static class Inner
 * {
 * public Inner ()
 * {
 * a++;
 * }
 * }
 * public static void main(String[] args)
 * {
 * Test.Inner ob = new Test.Inner();
 * System.out.println(a);
 * }
 * }
 */

/*
 * class Test {
 * static int a = 0;
 * public Test ()
 * {
 * a++;
 * }
 * static class Inner
 * {
 * public Inner ()
 * {
 * a++;
 * }
 * }
 * public static void main(String[] args)
 * {
 * Test.Inner ob = new Test.Inner();
 * System.out.println(a);
 * }
 * }
 */

/*
 * class Test {
 * int a = 10;
 * 
 * class Inner
 * {
 * int a = 100;
 * public void m1()
 * {
 * int a = 1000;
 * System.out.println(a);
 * System.out.println(this.a);
 * System.out.println(Test.this.a);
 * }
 * }
 * public static void main(String[] args)
 * {
 * Test.Inner ob = new Test().new Inner();
 * ob.m1();
 * }
 * }
 */

/*
 * class Test {
 * static int y = 10;
 * 
 * class Inner
 * {
 * int a = 100;
 * public void m1()
 * {
 * int a = 1000;
 * System.out.println(a);
 * System.out.println(this.a);
 * System.out.println(y);
 * }
 * }
 * public static void main(String[] args)
 * {
 * Test.Inner ob = new Test().new Inner();
 * ob.m1();
 * }
 * }
 */