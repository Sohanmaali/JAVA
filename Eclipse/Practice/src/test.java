
public class test {

	static int a = 10;

	public static void m1() {
		System.out.println(test.a);
	}

	public static void main(String[] args) {
		a = 20;
		System.out.println(a);
		test.m1();
		System.out.println(test.a);
		System.out.println("\"java\"");

	}
}
