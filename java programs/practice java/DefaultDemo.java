interface I {
	default void m1(){
		System.out.println("i default method");
	}
}
interface J {
	default void m1(){
		System.out.println("j default method");
	}
}
class DefaultDemo implements I,J{
	public void m1(){
		System.out.println("class method");
		I.super.m1();
		J.super.m1();
	}
	public static void main(String[] args) {
		DefaultDemo d = new DefaultDemo();
		d.m1();
	}
}