class Test {
	public static void main(String[] args) {
		int[] arr = {1,4,17,7,25,3,100};
		descSort(arr);
	}

	public static void descSort(int[] ar){
		int[] array = new int[ar.length];
		int x=0;
		for (int i=0; i<ar.length;i++ ) {
			for (int j=0; j<ar.length;j++ ) {
				if(ar[i] > ar[j]){
					x = ar[j]; 
					ar[j] = ar[i];
					ar[i] = x;
				}
			}
		}
		print_array(ar);
	}
	public static void print_array(int[] ars){
		for (int i=0; i<3;i++ ) {
			System.out.print(ars[i]+" ");
		}
	} 
}