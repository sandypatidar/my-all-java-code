class xxxValue {
	public static void main(String[] args) {
	Integer I = new Integer(130);
	System.out.println(I.byteValue());
	System.out.println(I.shortValue());
	System.out.println(I.intValue());
	System.out.println(I.longValue());
	System.out.println(I.floatValue());
	System.out.println(I.doubleValue());

	}
}

class charValue {
	public static void main(String[] args) {
		Character c = new Character('a');
		char ch = c.charValue();
		System.out.println(ch);
	}
}


class booleanValue {
	public static void main(String[] args) {
		Boolean b = new Boolean("sandeep");
		boolean bl = b.booleanValue();
		System.out.println(bl);
	}
}