package cls;
class Outer {
	int x = 10;
	static int y = 20;
	public static void m1() {
		class Inner {
			public void m2() {
				//System.out.println(x); // not valid
				System.out.println(y);
			}
		}
		Inner i = new Inner();
		i.m2();
	}
	public static void main(String[] args) {
		Outer o = new Outer();
			o.m1();
	}
}