class PrimeNu {
	public static void main(String[] args) {
		int input = 15;
		int copyinput = input;
		String binary = "";
		int a =0;
		int rem = 0;
		while(input>0) {
			rem = input % 2;
			binary = rem + binary;
			a = rem + a ;
			input = input/2;
		}
		System.out.println(binary+"...."+a);
	}
}