package cls;
class Outer {
	class Inner {
		public void m1() {
			System.out.println("inner class m1() method run.....");
		}
	}
	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		i.m1();
	}
}