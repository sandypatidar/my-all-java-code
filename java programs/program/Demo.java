package cls;
class Parent {
	int x = 10;
	static int y = 20;
	Parent(int a){
		System.out.println("hello I am constructor "+a);
	}
	public static void m1() {
		System.out.println("hello I am  m1() method "+y);
	}
	public void m2() {
		System.out.println("hello I am static m1() method "+x+" "+y);
	}
}
public class Demo extends Parent {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.m1();
	}
}