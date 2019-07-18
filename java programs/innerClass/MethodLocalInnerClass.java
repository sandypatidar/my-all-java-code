/*
	same time we declare a class in a method this type is called method local inner class
*/
package cls;
class Outer {
	public void m1() {
		int xs= 20;
		final int x = 200;
		class Inner {
			public void sum(){
				System.out.println(xs+x);
			}
		} 
		Inner i = new Inner();
		i.sum();
		i.sum();
	}
	public static void main(String[] args) {
		Outer o =new Outer();
		o.m1();
	}
}