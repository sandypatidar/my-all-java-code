/*
   1. identification of instance member in a class from top to bottom
   2. Execution of instance variable assignment and instance blocks from top to bottom 
   3. Execution of constructor and then main method  
*/

class InstanceDemo {
	 int i=10;
	 {
		m1();
		System.out.println("first instance  block");
	}
	InstanceDemo() {
		System.out.println("constructor");

	}
	public static void main(String[] args) {
		InstanceDemo id = new InstanceDemo();
		// id.m1();
		System.out.println("Main method");
	}
	public  void m1() {
		System.out.println(j);
	}
	{
		System.out.println("second instance  block");
	}
	 int j=20;
}
