class ValueOfInt {
	public static void main(String[] args) {
		Integer I = Integer.valueOf("1111",2);
		System.out.println(I);

		Integer j = Integer.valueOf("1111",7);
		System.out.println(j);

		Integer k = Integer.valueOf("1111",10);
		System.out.println(k);

		Integer l = Integer.valueOf("1111",17);
		System.out.println(l);

		Integer m = Integer.valueOf("1111",25);
		System.out.println(m);

		Integer n = Integer.valueOf("1111",36);
		System.out.println(n);

		// invalid... (Exception java.lang.NumberFormatException )
		Integer o = Integer.valueOf("1111",37);
		System.out.println(o);
	}
}