// class A{

// // A()
// // {
// // System.out.println("Constructor of A");
// // }
// public void m1(){
// System.out.println("Block of A-m1");
// }
// }
// class B extends A{
// // B()
// // {
// // System.out.println("Constructor of B");
// // }
// public void m1(){
// System.out.println("Block of B");
// }

// }
// class C extends A{
// // C()
// // {
// // System.out.println("Constructor of B");
// // }
// public void m1(){
// System.out.println("Block of m1");
// }
// }

// class Main
// {
// public static void main(String args[])
// {
// C b = new C();
// b.m1();
// }
// }
/**
 * Test
 */
class Test {
	public static void main(String[] args) {
		boolean myVal = false;
		if (myVal = true) {
			for (int i = 0; i < 3; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("else");
		}
	}

}