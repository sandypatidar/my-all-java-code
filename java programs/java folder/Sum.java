class Sum {
	static void sums(int n) {
		int a=0, sm = 0;
		while(n!=0){
			a = n%10;
			n = n/10;
			sm = sm + a;
		}
		System.out.println(sm);
	}
	public static void main(String[] args) {
		Sum.sums(5464);
	}
}