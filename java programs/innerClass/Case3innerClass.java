/*
	Accessing a inner class code from outside of outer class 
*/
package cls;
class Outer {
	int x =10;
	class Inner {
		int x =100;
		public void m1(){
			int x =1000;
			System.out.println("inner class method case 3");
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(Outer.this.x);

		}
	}
	// public void m2() {
	// 	Inner i = new Inner();
	// 	i.m1();
	// }
} 
class Test {
	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		i.m1();
	}
}