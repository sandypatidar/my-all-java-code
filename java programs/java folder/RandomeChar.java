class RandomeChar {
	public static String getRandomAlfa(int n){
		StringBuffer sb  = new StringBuffer(n);

		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"+"abcdefghijklmnopqrstuvwxyz"+"1234567890"+"@#$%&";
		for (int i=0; i<n;i++ ) {
			int j = (int)(str.length()*Math.random());

			sb.append(str.charAt(j));
		}
		return sb.toString();
	}

	public void enc(String str){
		if(str.charAt(2) == '@') {
			System.out.print("you can install the software\n");
			System.out.println("product key is "+str);
		} else {
			System.out.print("productKey not correct");
			System.out.println("\n"+str);
		}
	}

	public static void main(String[] args) {
		RandomeChar r = new RandomeChar();
		String s = getRandomAlfa(8);
		r.enc(s);
		System.out.println();
	}
}