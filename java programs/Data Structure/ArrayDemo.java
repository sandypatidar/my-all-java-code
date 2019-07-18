class Test {
	public static void main(String[] args) {
		int[][]arr = {{10,20,30},{40,50,60}};
		System.out.println("the original array");
		print_array(arr);
		System.out.println("After changing the row and coloum of the said array: ");
		transport(arr);
	}

	private static void transport(int[][] arr) {
		int[][] newArr = new int[arr[0].length][arr.length];

		for (int i=0; i<arr.length;i++ ) {
			for (int j=0;j<arr[0].length ;j++ ) {
				newArr[j][i] = arr[i][j];
			}
		}
		print_array(newArr);
	}

	private static void print_array(int[][] twodm){
		for (int i=0; i<twodm.length; i++) {
			for (int j=0; j<twodm[0].length;j++ ) {
				System.out.print(twodm[i][j] + " ");
			}
			System.out.println();
		}
	}
}