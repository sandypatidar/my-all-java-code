class Extra {
	public static void main(String[] args) {
		byte [] b = {100,101,103,104};
		String s = new String(b);
		s  = s.concat(" software");
		 s = s+" durga";
		 s += " sandeep";
		System.out.print(s);
	}
}