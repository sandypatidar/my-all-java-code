package cls;
class Example {
	int i =10;
	static int j =20;
	public  void m1(){
		int k = 30; // durga ji called it get compile time error
		final int m = 40;
		final class Exam {
			public  void m2() {
				System.out.println(i);
				System.out.println(j);
				System.out.println(k);
				System.out.println(m);
			}
		}
		Exam e = new Exam();
		e.m2();
	}
	
	public static void main(String[] args) {
		Example ex = new Example();
		ex.m1();
	}
}