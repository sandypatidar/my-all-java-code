package innerclass;
/*
 * Popcarn p = new popcarn(); just create popcarn object
 * Popcarn p = new Popcarn() { }
 * we are declaring a class without name that extends popcarn  
 * for that child class we are creating a object with parent reference
 * 
*/
class Popcarn {
	public void test() {
		System.out.println("salty");
	}
}
public class AnonemousInnerClass {
	public static void main(String[] args) {
		Popcarn p = new Popcarn() {
			public void test() {
				System.out.println("spicy");
			}
		};
		p.test();
		Popcarn p1 = new Popcarn();
		p1.test();
		Popcarn p2 = new Popcarn() {
			public void test() {
				System.out.println("sweet");
			}
		};		
		p2.test();
		System.out.println(p.getClass().getName());
		System.out.println(p1.getClass().getName());
		System.out.println(p2.getClass().getName());
	}
}
