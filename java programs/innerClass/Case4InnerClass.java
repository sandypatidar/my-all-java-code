package cls;
class Outer {
	class Inner {
		class MoreInner{
		public void m1(){
			System.out.println("inner class method case 4");
			}
		}
	}
} 
class Test {
	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		Outer.Inner.MoreInner mi = i.new MoreInner();
		mi.m1();
	}
}