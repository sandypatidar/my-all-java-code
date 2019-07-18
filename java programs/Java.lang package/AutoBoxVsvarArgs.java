class AutoBoxVsvarArgs {
	public static void m1(int... x) {
		System.out.println("var-args method");
	}
	public static void m1(Integer I) {
		System.out.println("auto boxing");
	}
	public static void main(String[] args) {
		int x = 10;
		m1(x);
	}
}

// auto boxing because var-args method use at default case type 

// prescience of compiling widening > auto-boxing > var-args