class WideningVsVarArgs {
	public static void m1(int... x) {
		System.out.println("var-args method");
	}
	public static void m1(long l) {
		System.out.println("widening");
	}
	public static void main(String[] args) {
		int x = 10;
		m1(x);
	}
}

// widening run because it is old process 