public class PrimeNum {
	public static void main(String[] args) {
		int n = 123;
		int count = 0;
		for(int i=2;i<100/2;i++){
			if(n%i == 0){
				count++;
			}
		}

		if(count == 0) {
			System.out.println("the number is prime ");
		}
		else {
			System.out.println("the number is not prime ");

		}
	}
}