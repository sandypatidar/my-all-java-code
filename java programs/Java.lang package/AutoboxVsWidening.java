class AutoBoxVsWidening {
	public static void m1(Integer I) {
		System.out.println("Auto Boxing");
	}
	public static void m1(long l) {
		System.out.println("widening");
	}
	public static void main(String[] args) {
		int x = 10;
		m1(x);
	}
}