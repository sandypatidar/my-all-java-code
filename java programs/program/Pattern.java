public class Pattern {
	public static void main(String[] args) {
		int a = 0,b = 1;
		int z = 5;
		for (int i=0; i<=5; i++) {
			for (int j =0; j<i;j++ ) {
			System.out.print(a+" ");
			int c = a+b;
			a = b;
			b = c;
			}
			System.out.println();
		}
	}
}