/* 
	sum time we can declare inner class without name this inner class called anonymous inner class
*/
/*
  1. Anonymous inner class that extends a class
  2. Anonymous inner class that implements an interface
  3. Anonymous inner class that defined inside arguments
 */
package cls;
class Hello {
	public void m1(){
		System.out.println("hello world");
	}
}
class Example {
	public static void main(String[] args) {
		Hello h = new Hello() {
		};
			h.m1();
	}
}