class A {
	void m1(){
		System.out.println("m1() method");
	}
}
class B extends A {
	void m2(){
		System.out.println("m2() method");
	}
}
public class Inheritance {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		A a1 = new B();
		a.m1();
		// a.m2(); // not valid 
		b.m3();
		b.m2();
		a1.m1();
		// a1.m2(); not valid 
	}
}