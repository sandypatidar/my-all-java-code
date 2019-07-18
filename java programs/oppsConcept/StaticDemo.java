// Execution process := 
// 1. Identification of static member from parent to child 
// 2. Execution of static variable assignment and static block from parent to child
// 3. Execution of only child class main  method because we run a child class 
// 4. if we are run parent class only parent main method will execute 
class Base {
	static int i=10;
	static {
		m1();
		System.out.println("base static block");
	}
	public static void main(String[] args) {
		m1();
		System.out.println("base main method");
	}
	public static void m1() {
		System.out.println(j);
	}
	static int j=20;
}

class Derived extends Base {
	static int x = 100;
	static {
		m2();
		System.out.println("derived first static block");
	}
	public static void main(String[] args) {
		m2();
		System.out.println("derived main method");
	}
	public static void m2() {
		System.out.println(y);
	}
	static {
		System.out.println("derived second static block");
	}
	static int y = 200;
}