class Sandyp {
	public static void main(String[] args) {
		int x=0,z=5,y=z;
		for (int i=0;i<5;i++ ) {
			for (int j=0;j<=i;j++ ) {
			System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		for (int i=0;i<5;i++ ) {
			for (int j=5;j>i;j-- ) {
			System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		for (int i=0;i<5;i++ ) {
			for (int j=5;j>i;j-- ) {
			System.out.print("  ");
			}
			for (int k=0; k<=i;k++ ) {
				System.out.print(" *");
				// System.out.print(" ");
			}
			System.out.println(" ");
		}
		System.out.println();
		System.out.println();

		for (int i=0;i<5;i++ ) {
			for (int j=5;j>i;j-- ) {
			System.out.print(" ");
			}
			for (int k=0; k<=i;k++ ) {
				System.out.print("* ");
				// System.out.print(" ");
			}
			System.out.println(" ");
		}

		System.out.println();
		System.out.println();

		for (int i=0; i<=5; i++) {
			for (int j=0;j<i ;j++ ) {
				System.out.print("   ");
			}
			for (int k = y; k>0; k--) {
				System.out.print("* ");
			}
			System.out.println();
			y--;
		}




		System.out.println();
		System.out.println();

		for (int i=0; i<=5; i++) {
			for (int j = 0; j<i+1; j++) {
				System.out.print(" ");
			}
			for (int k=0; k<z;k++ ) {
				System.out.print("* ");
			}
			z--;
			System.out.println();
		}
	}
}