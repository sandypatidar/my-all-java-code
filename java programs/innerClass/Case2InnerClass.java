package cls;
class Outer {
	class Inner {
		public void m1(){
			System.out.println("inner class method case 2");
		}
	}
	public void m2() {
		Inner i = new Inner();
		i.m1();
	}
	public static void main(String[] args) {
		Outer o = new Outer();
		o.m2();
	}
} 