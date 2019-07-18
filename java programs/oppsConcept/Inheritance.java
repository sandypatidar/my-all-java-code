class P {
	public void m1(){
		System.out.println("parent");
	}
}
class C extends P {
	public void m2() {
		System.out.println("child");
	}
}
public class  {
	public static void main(String[] args){
		P p = new P();
		p.m1(); //true
		p.m2(); //false

		C c= new C();
		c.m1(); //true
		c.m2(); //true

		P p1 = new C();
		p1.m1(); // true
		p1.m2(); // false

		C c1 = new P(); // false

	}
}