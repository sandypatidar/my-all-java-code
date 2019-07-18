class InternDemo {
	public static void main(String[] args) {
		String s1 = new String("durga");
		String s2 = s1.intern();
		System.out.println(s1 == s2); // false
		String s3 = "durga";
		System.out.println(s2 == s2); // true
		String s4 = s1.concat("software");
		String s5 = s4.intern();
		System.out.println(s4 == s5); // true
		String s6 = "durgasoftware";
		System.out.println(s5 == s6); // true

	}
}