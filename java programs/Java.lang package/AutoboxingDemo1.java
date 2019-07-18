class AutoboxingDemo1 {
	// static Integer I;
	public static void main(String[] args) {
		// int m = I;
		// System.out.println(m);
		Integer x = -127;
		Integer y = Integer.valueOf(-127);
		System.out.println(x == y);

	}
}