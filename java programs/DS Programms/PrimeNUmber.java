class PrimeNumber {
	static int x = 11;
	boolean flag = false;
	public void findNum(int num){
		for (int i=2; i<num/2;i++ ) {
			if (num%i == 0) {
				flag = true;
				break;
		    }
		}
		if(!flag){
			System.out.println(num + " is a prime number.");
		}
		else {
			System.out.println(num + " is not a prime number.");

		}
	}
	public static void main(String[] args) {
		PrimeNumber n = new PrimeNumber();
		n.findNum(x);
	}
}