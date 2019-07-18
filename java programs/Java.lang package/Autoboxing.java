class Autoboxing {
	static Integer I = 10; // autoboxing
	public static void main(String[] args) {
		int i = I; //autounboxing
		m1(i); 
	}
	public static void m1(Integer k) { // autoboxing
		int m = k; //autounboxing
		System.out.println(m);
	}
}