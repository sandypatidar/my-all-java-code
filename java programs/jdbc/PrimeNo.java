import java.util.*;
class PrimeNo {
	static int flag=1;
	static int a = 0;
	public static int primeFunction(int first ,int last ) {
		for (int i=first; i<last; i++) {
			for (int j=2; j<i;j++ ) {
				if(i%j == 0) {
					// System.out.println(i);
					// flag = flag + 1;
				}
				else {
				  return  i;
				
					// retur`n a;
				}
				if(a >0){
					// return a;
				}
			}
		}
		return 0;
	}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the two number");
			int first = sc.nextInt();
			int last = sc.nextInt();
			int result = primeFunction(first, last);
			System.out.println("prime no between the limit are number "+result);
		}
	}