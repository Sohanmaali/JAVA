
abstract class A {
	int a =10;

	public A(int a) {
		this.a = a;
	}
}

class B extends A {
	public B(int a) {
		super(a);
	}
	public void c()
	{
		System.out.println(this.a);
	}
}
class C extends B
{
	public C(int a) {
		super(a);
	}
	public void d()
	{
		System.out.println(super.a);
	}
}
class Test {

	public static void main(String[] args) {
		C ob =new C();
		ob.d();
	}
}