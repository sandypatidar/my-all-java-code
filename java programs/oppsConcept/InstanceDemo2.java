/* 
   1. identification of instance member in a class from parent to child
   2. Execution of instance variable assignment and instance block only in parent class
   3. Execution of parent constructor
   4. Execution of instance variable assignment and instance block  in child class
   5. Execution of child constructor
*/
class Parent  {
	int i=10;
	{
		m1();
		System.out.println("parent instance block");
	}
	Parent() {
		System.out.println("parent construction");
	}
	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println("parent main method");
	}
	public  void m1() {
		System.out.println(j);
	}
	int j=20;
}

class Child extends Parent {
	int x = 100;
	{
		m2();
		System.out.println("child first instance block");
	}
	Child(){
		System.out.println("child constructor");
	}
	public static void main(String[] args) {
		Child c = new Child(); 
		System.out.println("child main method");
	}
	public  void m2() {
		System.out.println(y);
	}
	{
		System.out.println("child second instance block");
	}
	int y = 200;
}