package clas;
class A {
	public void add(int a, int b) {
		System.out.println(a+b);
	}
}
class B extends A {
	public void add(int x, int y) {
		System.out.println(x*y);
	}
}
public class OverrideDemo {
	public static void main(String[] args) {
		A a = new A();
		// B b = new B();
		a.add(3,5);
	}
}
